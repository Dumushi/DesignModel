package kind.strategy;

/**
 *
 * Description:
 *      具体策略类
 * @author: mushi
 * @Date: 2021/2/20 13:18
 */
public class ConcreteA implements Strategy {

    /**
     * 一种实现业务逻辑的算法
     */
    @Override
    public void straegyMethod() {
        System.out.println("具体策略类A");
    }
}
