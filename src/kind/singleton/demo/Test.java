package kind.singleton.demo;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/4 14:30
 */
public class Test {

    public static void main(String[] args) {

        //懒汉模式
        Bee bee1 = Bee.getInstance();
        Bee bee2 = Bee.getInstance();
        if (bee1 == bee2) {
            System.out.println("同一个bee，Bee只创建了一个实例");
        }else{
            System.out.println("不是同一个bee,Bee创建了两次");
        }

        //饿汉模式
        NewBee newBee1 = NewBee.getInstance();
        NewBee newBee2 = NewBee.getInstance();
        if (newBee1 == newBee2){
            System.out.println("同一个newBee，NewBee只创建了一个实例");
        }else{
            System.out.println("不是同一个newBee，newBee创建了两次");
        }

    }

}
