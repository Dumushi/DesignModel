package kind.builder;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 10:24
 */
public class Builder implements AbstractBuilder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        System.out.println(this.getClass().getSimpleName()+"/buildPartA()拼接A");
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        System.out.println(this.getClass().getSimpleName()+"/buildPartB()拼接B");
        product.setPartB("B");
    }

    @Override
    public void buildPartC() {
        System.out.println(this.getClass().getSimpleName()+"/buildPartC()拼接C");
        product.setPartC("C");
    }

    /**
     * 拼接
     */
    @Override
    public Product splice() {
        return product;
    }

}
