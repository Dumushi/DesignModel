package kind.iterator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/22 14:54
 */
public class Test {

    public static void main(String[] args) {

        //创建一个对象聚合，并往聚合中添加数据
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add(s1);
        aggregate.add(s2);
        aggregate.add(s3);

        //获取聚合的迭代器，通过迭代器访问聚合内的数据
        Iterator iterator = aggregate.getIterator();

        System.out.println(iterator.first());
        System.out.println(iterator.next());
        System.out.println(iterator.last());
        System.out.println(iterator.hasnext());
    }

}
