package kind.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Description:
 *      中介
 * @author: mushi
 * @Date: 2021/2/22 13:30
 */
public class MediatorA extends Mediator{

    //中介手中的所有人力资源
    private List<Person> list = new ArrayList<>();

    //添加资源,人和中介绑定
    @Override
    public void register(Person person) {
        if (!list.contains(person)){
            list.add(person);
            person.setMediator(this);
        }
    }

    //介绍
    @Override
    public void sendMsg(Person person,String msg) {
        System.out.println("中介收到消息："+msg+">>>>开始转发给"+person.getClass().getSimpleName());
        person.receive(msg);
    }

}
