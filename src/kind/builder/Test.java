package kind.builder;

/**
 *
 * Description:
 *          向指挥者发出请求
 * @author: mushi
 * @Date: 2021/2/5 10:37
 */
public class Test {

    public static void main(String[] args) {
        //生产产品
        Director director = new Director(new Builder());
        //组装产品
        Product construct = director.construct();

        System.out.println("生产的产品是："+construct.toString());
    }

}
