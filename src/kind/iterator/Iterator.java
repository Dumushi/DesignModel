package kind.iterator;

/**
 * 抽象迭代器
 * */
public interface Iterator {

    Object first();

    Object next();

    Object last();

    boolean hasnext();

}
