package kind.mediator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/22 13:45
 */
public class Test {

    public static void main(String[] args) {
        //创建一个中介
        Mediator mediatorA = new MediatorA();
        //创建老板和员工并添加到同一个中介人力资源里
        Person boss = new Boss();
        Person worker = new Worker();
        mediatorA.register(boss);
        mediatorA.register(worker);
        //向中介发消息 中介转给对应资源
        String msg = "招牛郎";
        String msg2 = "面试牛郎";
        boss.callMediator(worker,msg);
        worker.callMediator(boss,msg2);
    }

}
