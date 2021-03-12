package kind.visitor;

/**抽象元素类*/

public interface Element {

    /**和访问者绑定*/
    void accept(Visitor visitor);

    /**元素的具体行为*/
    String opration();

}
