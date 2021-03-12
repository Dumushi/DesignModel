package kind.command;

/**
 *
 * Description:
 *      请求者
 * @author: mushi
 * @Date: 2021/2/20 14:03
 */
public class Requester {

    private Command command;

    /**发送命令*/
    public void sendCommand(){
        command.excute();
    }

    public Requester(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
