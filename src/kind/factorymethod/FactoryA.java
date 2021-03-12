package kind.factorymethod;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/4 17:12
 */
public class FactoryA implements Factory {

    @Override
    public NewBee make() {
        System.out.print("工厂A===>");
        return new NewBeeA();
    }
}
