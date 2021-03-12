package kind.command;

/**
 *
 * Description:
 *          具体命令（遥控器按键）
 * @author: mushi
 * @Date: 2021/2/20 13:57
 */
public class ConcreteCommand implements Command{

    /**该命令的具体执行者*/
    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    /**命令对应的处理方法*/
    @Override
    public void excute() {
        receiver.action();
    }

}
