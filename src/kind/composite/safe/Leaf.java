package kind.composite.safe;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/20 10:07
 */
public class Leaf implements Root{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("安全模式树叶"+name);
    }
}
