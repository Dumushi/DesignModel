package kind.command;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/20 14:07
 */
public class Test {

    public static void main(String[] args) {
        //具体命令
        Command command = new ConcreteCommand();
        //命令请求者发送命令
        Requester requester = new Requester(command);
        requester.sendCommand();
    }

}
