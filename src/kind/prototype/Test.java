package kind.prototype;

/**
 *
 * Description:
 *          原型模式
 * @author: mushi
 * @Date: 2021/2/4 15:18
 */
public class Test {

    public static void main(String[] args) {
        Bee bee = new Bee();

        try {
            Bee bee2 = (Bee) bee.clone();
            if (bee == bee2){
                System.out.println("bee2不是克隆体");
            }else{
                System.out.println("bee2是克隆体");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
