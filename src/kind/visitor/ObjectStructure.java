package kind.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Description:
 *          对象结构
 * @author: mushi
 * @Date: 2021/2/22 16:34
 */
public class ObjectStructure {

    //对象结构中包含的元素
    private List<Element> list = new ArrayList<>();

    /**通过访问者访问对象结构中的所有元素*/
    public void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }

    /**管理对象结构中的元素*/
    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
