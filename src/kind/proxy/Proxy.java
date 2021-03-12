package kind.proxy;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 13:48
 */
public class Proxy implements Subject {

    private Target target = new Target();

    /**代理方法*/
    @Override
    public void show() {
        before();
        target.show();
        after();
    }


    /**方法增强*/
    public void before(){

    }

    public void after(){

    }
}
