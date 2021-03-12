package kind.composite.lucency;

/**树枝和树叶都要实现的接口*/
public interface Root {

    void add(Root c);
    void remove(Root c);
    Root getChild(int i);
    void operation();
}
