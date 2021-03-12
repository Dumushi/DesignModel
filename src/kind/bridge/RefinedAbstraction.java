package kind.bridge;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 15:07
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void opration() {
        System.out.println("重写抽象类方法");
        //还要调用父类中的对象进行操作
        super.implementor.operation();
    }
}
