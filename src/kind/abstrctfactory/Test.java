package kind.abstrctfactory;

/**
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 9:25
 */
public class Test {

    public static void main(String[] args) {
        Factory facory = new AbstrctFacory();
        NewBeeA beeA = facory.creatNewBeeA();
        beeA.show();
        NewBeeB beeB = facory.creatNewBeeB();
        beeB.show();
    }

}
