package org.leave.grammar.aop;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        before();
        System.out.println("Hello! " + name);
        after();
    }

    private void before(){
        System.out.println("GreetingImpl Before");
    }

    private void after(){
        System.out.println("GreetingImpl After");
    }
}
