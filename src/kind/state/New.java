package kind.state;

/**
 *
 * Description:
 *          具体状态
 * @author: mushi
 * @Date: 2021/2/21 9:23
 */
public class New extends State{

    @Override
    public void Handle(Context context) {
        System.out.println("当前处于新建状态");
        //判断对象的行为设置对象的下一个状态
        context.setState(new Runable());
    }
}
