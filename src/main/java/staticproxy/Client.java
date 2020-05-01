package staticproxy;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/5/1 12:37
 * @Created by mmz
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
