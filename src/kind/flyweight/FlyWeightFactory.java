package kind.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Description:
 *      享元角色工厂
 * @author: mushi
 * @Date: 2021/2/6 13:35
 */
public class FlyWeightFactory {

    //储存共享的对象
    private Map<String,AbstrctFlyWeight> map = new HashMap<>();

    public RealFlyWeight getRealFlyWeight(String k){

        RealFlyWeight realFlyWeight = (RealFlyWeight) map.get(k);

        if (realFlyWeight!=null){
            //对象已经创建并共享
        }else{
            //创建对象、共享并储存
            realFlyWeight = new RealFlyWeight();
            map.put(k,realFlyWeight);
        }

        return realFlyWeight;
    }

}
