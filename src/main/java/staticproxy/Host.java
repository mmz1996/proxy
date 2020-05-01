package staticproxy;

/**
 * @Classname Host
 * @Description 被代理对象，想要出租房子的人
 * @Date 2020/5/1 12:33
 * @Created by mmz
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
