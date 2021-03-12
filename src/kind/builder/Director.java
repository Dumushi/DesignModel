package kind.builder;

/**
 *
 * Description:
 *          指挥者，指挥生产者组装产品
 * @author: mushi
 * @Date: 2021/2/5 10:34
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**产品创建和组装*/
    public Product construct(){

        System.out.println(this.getClass().getSimpleName()+"/construst()调用Builder创建产品并组装");

        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        return builder.splice();

    }
}
