package kind.builder;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 10:18
 */
public interface AbstractBuilder {

    void buildPartA();
    void buildPartB();
    void buildPartC();
    /**拼接*/
    Product splice();

}
