package kind.flyweight;

/**
 *
 * Description:
 *   非享元角色,不共享的外部状态
 * @author: mushi
 * @Date: 2021/2/6 13:30
 */
public class NotFlyWeight {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
