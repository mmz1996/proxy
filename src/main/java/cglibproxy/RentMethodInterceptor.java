package cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname RentMethodInterceptor
 * @Description TODO
 * @Date 2020/5/1 21:09
 * @Created by mmz
 */
public class RentMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib方法增强");
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
