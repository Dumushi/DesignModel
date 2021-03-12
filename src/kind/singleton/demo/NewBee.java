package kind.singleton.demo;

/**
 *
 * Description:
 *              饿汉模式
 * @author: mushi
 * @Date: 2021/2/4 14:36
 */
public class NewBee {

    private NewBee(){
        System.out.println("我是第一个NewBee");
    }

    private static volatile NewBee newBee = new NewBee();

    public static synchronized NewBee getInstance(){
        return newBee;
    }

}
