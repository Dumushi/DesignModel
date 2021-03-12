package kind.singleton;

/**
 *
 * Description:
 *          单例模式,懒汉模式
 * @author: mushi
 * @Date: 2021/2/4 14:16
 */
public class SingletonLazy {

    /**在其他类调用本类的实例化方法时才创建一个实例
     * volatile，轻量级线程锁、保证在所有线程中只有一个当前类的实例
     * */
    private static volatile SingletonLazy singleton = null;

    /**私有化构造方法，防止外部创建*/
    private SingletonLazy(){

    }

    /**对外的全局使用方法*/
    public SingletonLazy getInstance(){
        if (singleton==null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }

}
