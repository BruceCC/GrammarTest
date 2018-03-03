package org.leave.grammar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("YE");
    }
}
