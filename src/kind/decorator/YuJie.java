package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 16:40
 */
public class YuJie extends Grow {

    public YuJie(Girl girl) {
        super(girl);
    }

    @Override
    public void cry() {
        //增强
        System.out.println("变身御姐，高冷");
    }

    @Override
    public void beauty() {
        //增强
        System.out.println("变身御姐，漂亮");
    }

    //更改了源构件角色的结构
    public void weight(){
        System.out.println("九十斤");
    }
}
