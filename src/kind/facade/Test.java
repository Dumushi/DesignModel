package kind.facade;

/**
 *
 * Description:
 *      客户
 * @author: mushi
 * @Date: 2021/2/6 11:42
 */
public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();
        //通过这个角色的方法去调用子系统的功能
        facade.method();
    }

}
