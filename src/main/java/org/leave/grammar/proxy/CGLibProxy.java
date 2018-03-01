package org.leave.grammar.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy  implements MethodInterceptor {
    private static CGLibProxy instance = new CGLibProxy();

    private CGLibProxy() {
    }

    static public CGLibProxy getInstance(){
        return instance;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls, this);
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();

        return result;
    }

    private void before(){
        System.out.println("CGLibProxy Before");
    }

    private void after(){
        System.out.println("CGLibProxy After");
    }
}
