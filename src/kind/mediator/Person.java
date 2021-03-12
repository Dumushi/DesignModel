package kind.mediator;

/**
 *
 * Description:
 *      抽象同事类
 * @author: mushi
 * @Date: 2021/2/22 13:31
 */
public abstract class Person {

    //都要有同一个中介的联系方式
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**接收中介的消息*/
    public abstract void receive(String msg);

    /**联系中介*/
    public abstract void callMediator(Person person,String msg);



}
