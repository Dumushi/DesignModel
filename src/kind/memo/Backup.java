package kind.memo;

/**
 *
 * 备忘录
 * 存储发起者的某状态，在需要回滚的时候用该类的状态替换发起者当前状态
 * @Auth duweikun
 * @Date 2021/2/22
 */
public class Backup {

    private String state;

    public Backup(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
