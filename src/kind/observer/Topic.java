package kind.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Description:
 *          抽象目标
 *          （所有公众号的父类）
 * @author: mushi
 * @Date: 2021/2/22 10:46
 */
public abstract class Topic {

    private List<Fans> fansList = new ArrayList();

    //添加观察者（粉丝）
    public void addFans(Fans fans){
        fansList.add(fans);
    }

    //删除观察者（粉丝）
    public void removeFans(Fans fans){
        fansList.remove(fans);
    }

    public List<Fans> getFansList() {
        return fansList;
    }

    public void setFansList(List<Fans> fansList) {
        this.fansList = fansList;
    }

    //通知观察者（群发消息）
    public abstract void sendMsgToAllFans(String msg);

    //接收观察者发送的消息（接收来自粉丝的消息）
    public abstract void receiver(String fansName,String msg);

}
