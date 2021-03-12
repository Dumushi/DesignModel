package kind.composite.lucency;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Description:
 *      树枝
 * @author: mushi
 * @Date: 2021/2/20 9:50
 */
public class Composite implements Root{

    private List<Root> children = new ArrayList<>();

    /**添加子节点，添加树叶*/
    @Override
    public void add(Root c) {
        children.add(c);
    }

    /**移除子节点，移除树叶*/
    @Override
    public void remove(Root c) {
        children.remove(c);
    }

    /**获取子节点*/
    @Override
    public Root getChild(int i) {
        return children.get(i);
    }

    /**访问子节点*/
    @Override
    public void operation() {
        for (Object o : children){
            ((Root)o).operation();
        }
    }

}
