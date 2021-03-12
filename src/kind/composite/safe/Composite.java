package kind.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Description:
 *          树枝
 * @author: mushi
 * @Date: 2021/2/20 10:06
 */
public class Composite implements Root{

    public List<Root> children = new ArrayList<>();

    /**添加子节点，添加树叶*/
    public void add(Root c) {
        children.add(c);
    }

    /**移除子节点，移除树叶*/
    public void remove(Root c) {
        children.remove(c);
    }

    /**获取子节点*/
    public Root getChild(int i) {
        return children.get(i);
    }

    /**访问子节点，访问树叶*/
    @Override
    public void operation() {
        for (Object o : children){
            ((Root)o).operation();
        }
    }

}
