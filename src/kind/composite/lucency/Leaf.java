package kind.composite.lucency;

/**
 *
 * Description:
 *      树叶
 * @author: mushi
 * @Date: 2021/2/20 9:51
 */
public class Leaf implements Root{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Root c) {

    }

    @Override
    public void remove(Root c) {

    }

    @Override
    public Root getChild(int i) {
        return null;
    }


    @Override
    public void operation() {
        System.out.println("透明模式树叶"+name);
    }

}
