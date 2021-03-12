package kind.visitor;

/**
 *
 * Description:
 *          具体元素类
 * @author: mushi
 * @Date: 2021/2/22 16:30
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String opration(){
        //元素的具体行为
        return "我是元素A";
    }

}
