package kind.iterator;

import java.util.List;

/**
 *
 * Description:
 *      具体迭代器
 * @author: mushi
 * @Date: 2021/2/22 14:49
 */
public class ConcreteIterator implements Iterator {

    private List list = null;
    private int index = -1;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object first() {
        this.index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object o = null;
        if (this.hasnext()){
            o =  list.get(++index);
        }
        return o;
    }

    @Override
    public Object last() {
        index = list.size()-1;
        return list.get(index);
    }

    @Override
    public boolean hasnext() {
        if (index<list.size()-1){
            return true;
        }else {
            return false;
        }
    }
}
