package kind.visitor;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/22 16:40
 */
public class Test {

    public static void main(String[] args) {
        //创建一个对象结构，并往对象结构中添加元素
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        //通过访问者访问对象结构中的所有元素
        os.accept(visitor);
        visitor = new VisitorB();
        os.accept(visitor);
    }

}
