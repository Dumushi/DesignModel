package kind.bridge;

/**
 *
 * Description:
 *          具体实现化角色
 * @author: mushi
 * @Date: 2021/2/5 15:06
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operation() {
        System.out.println("重写抽象类的方法");
    }
}
