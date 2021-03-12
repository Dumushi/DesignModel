package kind.composite.lucency;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/20 9:57
 */
public class Test {

    public static void main(String[] args) {
        //树枝对象
        Root composite = new Composite();
        //树叶对象
        Root leaf01 = new Leaf("红");
        Root leaf02 = new Leaf("黄");
        Root leaf03 = new Leaf("绿");
        //添加树叶到树枝下
        composite.add(leaf01);
        composite.add(leaf02);
        composite.add(leaf03);
        //通过树枝访问树叶
        composite.operation();

    }

}
