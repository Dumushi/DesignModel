package kind.iterator;

/**
 * 抽象聚合
 * */
public interface Aggregate {

    void add(Object o);

    void remove(Object o);

    Iterator getIterator();

}
