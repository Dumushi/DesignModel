package kind.memo;

/**
 *
 * 管理者
 * 管理备忘录的状态
 * @Auth duweikun
 * @Date 2021/2/22
 */
public class Manager {

    private Backup backup;

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }
}
