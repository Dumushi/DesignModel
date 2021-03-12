package kind.state;

/**
 *
 * Description:
 *          环境类
 *          定义客户需要的接口、内部维持一个当前状态并负责具体状态的切换
 * @author: mushi
 * @Date: 2021/2/21 9:16
 */
public class Context {

    private State state;

    //初始状态
    public Context() {
        this.state = new New();
    }

    //设置新状态
    public void setState(State state) {
        this.state = state;
    }

    //读取状态
    public State getState() {
        return state;
    }

    //修改对象当前状态
    public void Handle(){
        state.Handle(this);
    }

}
