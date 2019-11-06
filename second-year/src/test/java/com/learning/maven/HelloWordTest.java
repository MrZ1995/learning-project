package com.learning.maven;

import org.junit.Test;

/**
 * @author zouqi
 * @date 2019/11/6
 */
public class HelloWordTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void say(){
        helloWorld.say();
    }
}
