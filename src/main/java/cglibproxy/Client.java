package cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/5/1 21:18
 * @Created by mmz
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer  = new Enhancer();
        enhancer.setSuperclass(Host.class);
        enhancer.setCallback(new RentMethodInterceptor());
        Host host = (Host)enhancer.create();
        host.rent();
    }
}
