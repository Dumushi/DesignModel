package kind.observer;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/22 10:56
 */
public class FansA implements Fans {

    private String name;

    @Override
    public void receiver(String msg) {
        System.out.println("粉丝="+this.name+"=收到消息："+msg);
    }

    @Override
    public void send(String msg) {
        TopicA topicA = new TopicA();
        topicA.receiver(name,msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
