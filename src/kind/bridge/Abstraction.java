package kind.bridge;

/**
 *
 * Description:
 *          抽象化角色
 * @author: mushi
 * @Date: 2021/2/5 15:06
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void opration();
}
