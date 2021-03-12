package kind.prototype;

import java.io.Serializable;

/**
 *
 * Description:
 *          原型类，实现Cloneable接口，Cloneable接口包含克隆的方法
 * @author: mushi
 * @Date: 2021/2/4 15:15
 */
public class Bee implements Cloneable,Serializable{

    public Bee(){
        System.out.println("我是本体");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("我是克隆体");
        return super.clone();
    }


}
