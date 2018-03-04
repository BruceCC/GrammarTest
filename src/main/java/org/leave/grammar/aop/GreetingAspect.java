package org.leave.grammar.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
    @Around("execution(* org.leave.grammar.aop.GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before(){
        System.out.println("GreetingAspect Before");
    }

    private void after(){
        System.out.println("GreetingAspect After");
    }
}
