package kind.simplefactory;

/**
 *
 * Description:
 *              具体的产品
 * @author: mushi
 * @Date: 2021/2/4 15:56
 */
public class ABee implements Bee {

    @Override
    public String product() {
        //可以在这里创建实例
        System.out.println("生产产品A");
        return "A";
    }
}
