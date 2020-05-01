package staticproxy;

/**
 * @Classname Proxy
 * @Description TODO
 * @Date 2020/5/1 12:34
 * @Created by mmz
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fee();
    }

    private void seeHouse(){
        System.out.println("看房子");
    }

    private void fee(){
        System.out.println("收取中介费");
    }


}
