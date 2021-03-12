package kind.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Description:
 *          具体聚合
 * @author: mushi
 * @Date: 2021/2/22 14:47
 */
public class ConcreteAggregate implements Aggregate{

    //链表可以换成自定义的
    private List list = new ArrayList();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
