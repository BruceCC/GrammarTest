package org.leave.grammar.proxy;

import org.springframework.aop.framework.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        /**
         * 1
         */
       /* ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetintBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("zzz~");*/

        /**
         * 2
         */
        /*ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("zzz~");*/

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingAroundAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("zzz~");

    }
}
