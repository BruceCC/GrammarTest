package org.leave.grammar.proxy;

public class HelloImpl implements Hello {
    public void say(String name) {
        System.out.println("HelloImpl Hello! " + name);
    }

    public void haha(){
        System.out.println("Ha Ha!");
    }
}
