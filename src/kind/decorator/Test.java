package kind.decorator;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 16:44
 */
public class Test {

    //少女成长变身
    public static void main(String[] args) {

        Girl realGirl = new LittleGirl();
        realGirl.cry();
        realGirl.beauty();

        System.out.println("\n");

        Girl luoli = new LuoLi(realGirl);
        luoli.cry();
        luoli.beauty();
        ((LuoLi) luoli).weight();

        System.out.println("\n");

        Girl yujie = new YuJie(realGirl);
        yujie.cry();
        yujie.beauty();
        ((YuJie) yujie).weight();

        System.out.println("\n");

        Fighter fighter = new Fighter();
        fighter.cry();
        fighter.beauty();
    }

}
