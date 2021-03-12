package kind.state;

/**
 *
 * Description:
 *          具体状态
 * @author: mushi
 * @Date: 2021/2/21 9:27
 */
public class Death extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("死亡状态");
    }
}
