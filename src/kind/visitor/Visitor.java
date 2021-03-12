package kind.visitor;

/**抽象访问者*/

public interface Visitor {

    /**访问元素类入口*/
    void visit(Element element);

}
