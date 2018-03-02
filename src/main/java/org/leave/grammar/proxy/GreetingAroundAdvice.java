package org.leave.grammar.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingAroundAdvice implements MethodInterceptor {
    private void before(){
        System.out.println("GreetingAroundAdvice Before");
    }

    private void after(){
        System.out.println("GreetingAroundAdvice After");
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object result = methodInvocation.proceed();
        after();
        return result;
    }
}
