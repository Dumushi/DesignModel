package kind.strategy;

/**
 *
 * Description:
 *      环境类，持有一个策略类的引用(接口)，最终给客户端使用
 * @author: mushi
 * @Date: 2021/2/20 13:20
 */
public class Context {

    private Strategy strategy;

    /**调用策略方法*/
    public void strategyMethod(){
        strategy.straegyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
