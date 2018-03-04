package org.leave.grammar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        /*BeanNameAutoProxyCreator beanNameAutoProxyCreator = (BeanNameAutoProxyCreator) context.getBean("greetingProxy");*/
        GreetingImpl greetingImpl = context.getBean(GreetingImpl.class);
        greetingImpl.sayHello("123");
    }
}
