package kind.visitor;

/**
 *
 * Description:
 *      具体元素类
 * @author: mushi
 * @Date: 2021/2/22 16:32
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String opration(){
        //元素的具体行为
        return "我是元素B";
    }

}
