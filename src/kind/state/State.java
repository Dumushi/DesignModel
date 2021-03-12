package kind.state;

/**
 *
 * Description:
 *      抽象状态
 *      用来封装环境对象中的特定状态对应的行为，行为可以有多个
 * @author: mushi
 * @Date: 2021/2/21 9:14
 */
public abstract class State {

    //用来改变对象的状态
    public abstract void Handle(Context context);

}
