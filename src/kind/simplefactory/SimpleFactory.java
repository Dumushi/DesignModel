package kind.simplefactory;

/**
 *
 * Description:
 *              生产产品的简单工厂
 * @author: mushi
 * @Date: 2021/2/4 15:59
 */
public class SimpleFactory {

    public static void main(String[] args) {
        new SimpleFactory();
    }

    public SimpleFactory() {
        new ABee().product();
        new BBee().product();
    }
}
