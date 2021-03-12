package kind.state;

/**
 *
 * Description:
 *          具体状态
 * @author: mushi
 * @Date: 2021/2/21 9:25
 */
public class Runable extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("就绪状态");
        context.setState(new Run());
    }
}
