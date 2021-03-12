package kind.memo;

/**
 *
 * 发起人
 * 围绕此对象进行状态的修改
 * @Auth duweikun
 * @Date 2021/2/22
 */
public class Operator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**创建备忘录*/
    public Backup createBackup(){
        return new Backup(state);
    }

    /**恢复备忘录状态
     * 回滚状态
     * */
    public void restoreMemento(Backup backup) {
        System.out.println("恢复备忘录的状态");
        this.setState(backup.getState());
    }

}
