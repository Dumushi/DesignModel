package kind.memo;

/**
 * @Auth duweikun
 * @Date 2021/2/22
 */
public class Test {

    public static void main(String[] args) {

        //创建一个发起人
        Operator originator = new Operator();
        //创建一个管理者
        Manager caretaker = new Manager();

        //设置发起人的状态
        originator.setState("初始状态");
        System.out.println(originator.getState());
        //创建发起人的备忘录
        caretaker.setBackup(originator.createBackup());
        //修改发起人状态
        originator.setState("修改状态");
        System.out.println(originator.getState());
        //恢复状态
        originator.restoreMemento(caretaker.getBackup());
        System.out.println(originator.getState());
    }

}
