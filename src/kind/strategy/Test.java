package kind.strategy;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/20 13:21
 */
public class Test {

    public static void main(String[] args) {
        //环境对象
        Context context = new Context();

        //通过不同的策略实现功能，相当于调用不同的算法处理逻辑

        //策略A
        Strategy strategy = new ConcreteA();
        context.setStrategy(strategy);
        context.strategyMethod();
        //策略B
        Strategy strategy1 = new ConcreteB();
        context.setStrategy(strategy1);
        context.strategyMethod();
    }

}
