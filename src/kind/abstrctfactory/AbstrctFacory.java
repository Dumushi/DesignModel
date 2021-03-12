package kind.abstrctfactory;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 9:19
 */
public class AbstrctFacory implements Factory {

    @Override
    public NewBeeA creatNewBeeA() {
        System.out.println("生产NewBeeA");
        return new BeeA();
    }

    @Override
    public NewBeeB creatNewBeeB() {
        System.out.println("生产NewBeeB");
        return new BeeB();
    }


}
