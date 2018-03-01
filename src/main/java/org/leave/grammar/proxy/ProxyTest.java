package org.leave.grammar.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        /**
         * 1
         */
        /*Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");*/

        /**
         * 2
         */
       /* Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        //Hello helloProxy =  (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        Hello helloProxy =  dynamicProxy.getProxy();
        helloProxy.say("ZCM");*/

        /**
         * 3
         */
        //CGLibProxy cglibProxy = new CGLibProxy();
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);//会对被代理对象的所有方法进行代理
        helloProxy.say("Z");
        helloProxy.haha();
        helloProxy.toString();
        helloProxy.getClass();
    }
}
