package kind.bridge;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 15:06
 */
public class Test {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.opration();
    }

}
