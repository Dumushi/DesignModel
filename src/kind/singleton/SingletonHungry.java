package kind.singleton;

/**
 *
 * Description:
 *          单例模式，饿汉模式
 * @author: mushi
 * @Date: 2021/2/4 14:18
 */
public class SingletonHungry {

    /**类加载的时候就创建一个实例，不用等到外部调用getInstance方法时再创建，可适用于多线程*/
    private static final SingletonHungry singletonHungry = new SingletonHungry();

    /**私有化构造方法，防止外部创建实例*/
    private SingletonHungry(){

    }

    /**对外的全局调用实例方法*/
    public SingletonHungry getInstance(){
        return singletonHungry;
    }

}
