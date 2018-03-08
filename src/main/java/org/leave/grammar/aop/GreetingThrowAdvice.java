package org.leave.grammar.aop;


import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 抛出增强
 */
@Component
public class GreetingThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception e){
        System.out.println("------------------------Throwing Exception------------------------------");
        System.out.println("target class:" + target.getClass().getName());
        System.out.println("method name:" + method.getName());
        System.out.println("exception message:" + e.getMessage());
        System.out.println("------------------------------------------------------------------------");
    }
}
