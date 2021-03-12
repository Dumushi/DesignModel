package kind.state;

/**
 *
 * Description:
 *          具体状态
 * @author: mushi
 * @Date: 2021/2/21 9:26
 */
public class Block extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("阻塞状态");
        context.setState(new Death());
    }
}
