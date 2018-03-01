package org.leave.grammar.proxy;

public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }

    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    public void haha() {

    }

    private void before(){
        System.out.println("HelloProxy Before");
    }

    private void after(){
        System.out.println("HelloProxy After");
    }
}
