package kind.composite.safe;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/20 10:12
 */
public class Test {

    public static void main(String[] args) {
        //树枝,和透明模式中的定义类型不一样，透明模式中用Root
        Composite composite = new Composite();
        //树叶
        Root leaf01 = new Leaf("黑");
        Root leaf02 = new Leaf("白");
        Root leaf03 = new Leaf("紫");
        //添加树叶到树枝下
        composite.add(leaf01);
        composite.add(leaf02);
        composite.add(leaf03);
        //通过树枝访问树叶
        composite.operation();
    }

}
