package kind.flyweight;

/**
 *
 * Description:
 *      具体享元角色，用来共享的对象
 * @author: mushi
 * @Date: 2021/2/6 13:32
 */
public class RealFlyWeight implements AbstrctFlyWeight{

    @Override
    public void creat(NotFlyWeight notFlyWeight) {
        //操作不共享的对象
        notFlyWeight.getName();
    }

}
