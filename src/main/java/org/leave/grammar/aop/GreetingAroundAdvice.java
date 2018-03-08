package org.leave.grammar.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * 环绕增强
 */
@Component
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
