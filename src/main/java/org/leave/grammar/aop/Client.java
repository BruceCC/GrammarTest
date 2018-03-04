package org.leave.grammar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /**
        * 1
        * */
        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("YE");*/

        /**
        * 2
        * */
       /* GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingProxy");
        Apology apology = (Apology) greetingImpl;
        apology.saySorry("AAA");*/

       /**
       * 3
       * */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingProxy");
        greetingImpl.goodMorning("AAA");
        greetingImpl.goodNight("BBB");
    }
}
