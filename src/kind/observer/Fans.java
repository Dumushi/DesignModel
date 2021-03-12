package kind.observer;

/**
 *
 * Description:
 *          抽象观察者
 * @author: mushi
 * @Date: 2021/2/22 10:51
 */
public interface Fans {

    /**接收消息*/
    void receiver(String msg);

    /**发送消息*/
    void send(String msg);

}
