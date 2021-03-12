package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 17:17
 */
public class Fighter implements Girl {

    @Override
    public void cry() {
        System.out.println("女战士，猛虎咆哮");
    }

    @Override
    public void beauty() {
        System.out.println("女战士，英姿飒飒");
    }
}
