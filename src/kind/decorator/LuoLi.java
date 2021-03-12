package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 16:40
 */
public class LuoLi extends Grow{

    public LuoLi(Girl girl) {
        super(girl);
    }

    @Override
    public void cry() {
        System.out.println("变身萝莉，也哭");
    }

    @Override
    public void beauty() {
        System.out.println("变身萝莉，也丑");
    }

    public void weight(){
        System.out.println("两百斤");
    }
}
