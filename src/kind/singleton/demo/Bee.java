package kind.singleton.demo;

/**
 *
 * Description:
 *              懒汉模式
 * @author: mushi
 * @Date: 2021/2/4 14:27
 */
public class Bee {

    private Bee(){
        System.out.println("我是第一个bee");
    }

    private static volatile Bee bee = null;

    public static synchronized Bee getInstance(){
        if (bee == null){
            bee = new Bee();
        }else{
            System.out.println("本bee已经存在，不能搞两个bee");
        }
        return bee;
    }
}
