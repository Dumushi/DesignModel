package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 16:34
 */
public class LittleGirl implements Girl{

    @Override
    public void cry() {
        //增强
        System.out.println("小girl，哭");
    }

    @Override
    public void beauty() {
        //增强
        System.out.println("小girl，丑");
    }
}
