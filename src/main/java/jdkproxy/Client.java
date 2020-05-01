package jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/5/1 21:04
 * @Created by mmz
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        RentInvocationHandler rentInvocationHandler = new RentInvocationHandler(host);

        Rent p = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(),host.getClass().getInterfaces(),rentInvocationHandler);
        p.rent();
    }
}
