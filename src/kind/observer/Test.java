package kind.observer;

/**
 *
 * Description:
 *          观察者模式
 * @author: mushi
 * @Date: 2021/2/22 10:58
 */
public class Test {

    public static void main(String[] args) {

        //创建公众号
        Topic topicA = new TopicA();

        //创建粉丝
        Fans fansA = new FansA();
        ((FansA) fansA).setName("洛夫斯基");
        Fans fansB = new FansB();
        ((FansB) fansB).setName("俄罗斯套娃");

        //粉丝关注公众号
        topicA.addFans(fansA);
        topicA.addFans(fansB);

        //公众号群发消息
        topicA.sendMsgToAllFans("芜湖起飞");

        //粉丝给公众号发消息
        fansA.send("我是洛夫斯基");
        fansB.send("我是套娃");
    }

}
