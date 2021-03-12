package kind.observer;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/22 10:58
 */
public class FansB implements Fans {

    private String name;

    @Override
    public void receiver(String msg) {
        System.out.println("粉丝="+this.name+"=收到消息："+msg);
    }

    @Override
    public void send(String msg) {
        Topic topicA = new TopicA();
        topicA.receiver(name,msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
