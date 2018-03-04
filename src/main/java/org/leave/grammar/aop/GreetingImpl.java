package org.leave.grammar.aop;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        //before();
        System.out.println("GreetingImpl Hello! " + name);
        /*throw new RuntimeException("Error");*/
        //after();
    }

    public void goodMorning(String name){
        System.out.println("GreetingImpl Good morning");
    }

    public void goodNight(String name){
        System.out.println("GreetingImpl Good night");
    }

    private void before(){
        System.out.println("GreetingImpl Before");
    }

    private void after(){
        System.out.println("GreetingImpl After");
    }
}
