package kind.adapter.classmodel;

/**
 *
 * Description:
 *          适配器
 * @author: mushi
 * @Date: 2021/2/5 14:08
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void show() {
        super.specific();
    }

}
