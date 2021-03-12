package kind.adapter.beanmodel;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 14:21
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void show() {
        adaptee.specific();
    }
}
