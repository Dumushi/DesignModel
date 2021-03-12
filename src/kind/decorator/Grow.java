package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 16:38
 */
public class Grow implements Girl{

    private Girl girl;

    public Grow(Girl girl) {
        this.girl = girl;
    }

    public Grow() {
    }

    /**对方法的增强，不是对类的增强，结构不能改变*/

    @Override
    public void cry() {
        girl.cry();
    }

    @Override
    public void beauty() {
        girl.beauty();
    }

}
