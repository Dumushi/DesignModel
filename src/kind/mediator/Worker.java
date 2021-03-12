package kind.mediator;

/**
 *
 * Description:
 *      具体同事类
 * @author: mushi
 * @Date: 2021/2/22 13:29
 */
public class Worker extends Person {

    @Override
    public void receive(String msg) {
        System.out.println("员工收到中介消息："+msg);
    }

    @Override
    public void callMediator(Person person,String msg) {
        System.out.println("员工联系中介："+msg);
        Mediator mediator = super.getMediator();
        mediator.sendMsg(person,msg);
    }

}
