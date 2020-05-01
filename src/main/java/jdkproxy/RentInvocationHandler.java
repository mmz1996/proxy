package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname RentInvocationHandler
 * @Description TODO
 * @Date 2020/5/1 12:49
 * @Created by mmz
 */
public class RentInvocationHandler  implements InvocationHandler {
    private Object object;

    public RentInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理");
        Object result = method.invoke(object,args);

        return result;
    }
}
