package com.z.maishi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zouqi
 * @date 2020/3/24
 */
public class GuiTaiA implements InvocationHandler {
    private Object pingpai;

    public GuiTaiA(Object pingpai) {
        this.pingpai = pingpai;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("销售开始，柜台是：" + this.getClass().getSimpleName());
        method.invoke(pingpai, args);
        System.out.println("销售结束");
        return null;
    }
}
