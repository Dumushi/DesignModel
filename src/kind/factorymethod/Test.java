package kind.factorymethod;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/4 17:14
 */
public class Test {

    public static void main(String[] args) {


        Factory a = new FactoryA();
        NewBee beeA = a.make();
        beeA.Giao();

        Factory b = new FactoryB();
        NewBee beeB = b.make();
        beeB.Giao();
    }

}
