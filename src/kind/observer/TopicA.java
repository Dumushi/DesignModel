package kind.observer;

import java.util.List;

/**
 *
 * Description:
 *          具体目标
 *          （具体公众号）
 * @author: mushi
 * @Date: 2021/2/22 10:52
 */
public class TopicA extends Topic{

    @Override
    public void sendMsgToAllFans(String msg) {
        //发消息给所有粉丝
        List<Fans> fansList = super.getFansList();
        for (Fans fans : fansList){
            fans.receiver(msg);
        }
    }

    @Override
    public void receiver(String fansName, String msg) {
        //接收来自粉丝的消息
        System.out.println("公众号=收到粉丝"+fansName+"发来的："+msg);
    }
}
