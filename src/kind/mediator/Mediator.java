package kind.mediator;

/**
 *
 * Description:
 *      抽象中介者
 * @author: mushi
 * @Date: 2021/2/22 13:24
 */
public abstract class Mediator {

    /**添加资源*/
    public abstract void register(Person person);

    /**转发消息*/
    public abstract void sendMsg(Person person,String msg);

}
