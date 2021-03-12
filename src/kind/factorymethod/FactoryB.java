package kind.factorymethod;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/4 17:13
 */
public class FactoryB implements Factory {

    @Override
    public NewBee make() {
        System.out.print("工厂B===>");
        return new NewBeeB();
    }

}
