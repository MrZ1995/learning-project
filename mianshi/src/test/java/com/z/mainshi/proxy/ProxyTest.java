package com.z.mainshi.proxy;

import com.z.maishi.proxy.GuiTaiA;
import com.z.maishi.proxy.MaotaJiu;
import com.z.maishi.proxy.SellWine;
import com.z.maishi.proxy.Wuliangye;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zouqi
 * @date 2020/3/24
 */
public class ProxyTest {
    @Test
    public void test1(){
        MaotaJiu maotaJiu = new MaotaJiu();
        InvocationHandler jingxiao1 = new GuiTaiA(maotaJiu);
        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaotaJiu.class.getClassLoader(), MaotaJiu.class.getInterfaces(), jingxiao1);
        dynamicProxy.mainJiu();
    }

    @Test
    public void test2(){
        MaotaJiu maotaJiu = new MaotaJiu();
        Wuliangye wuliangye = new Wuliangye();
        InvocationHandler jingxiao1 = new GuiTaiA(maotaJiu);
        InvocationHandler jingxiao2 = new GuiTaiA(wuliangye);
        SellWine dynamicProxy1 = (SellWine) Proxy.newProxyInstance(MaotaJiu.class.getClassLoader(), MaotaJiu.class.getInterfaces(), jingxiao1);
        SellWine dynamicProxy2 = (SellWine) Proxy.newProxyInstance(Wuliangye.class.getClassLoader(), Wuliangye.class.getInterfaces(), jingxiao2);
        dynamicProxy1.mainJiu();
        dynamicProxy2.mainJiu();
    }
}
