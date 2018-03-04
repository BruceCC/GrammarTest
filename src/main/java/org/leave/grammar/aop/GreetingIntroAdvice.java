package org.leave.grammar.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology{
    public void saySorry(String name) {
        System.out.println("GreetingIntroAdvice Sorry! " + name);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }
}
