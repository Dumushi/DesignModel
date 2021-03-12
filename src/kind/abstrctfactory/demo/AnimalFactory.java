package kind.abstrctfactory.demo;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 9:38
 */
public class AnimalFactory implements Factory {

    @Override
    public Pig killPig() {
        System.out.println("动物工厂杀猪");
        return new Pig();
    }

    @Override
    public Turtle killTurtle() {
        System.out.println("动物工厂杀乌龟");
        return new Turtle();
    }

    @Override
    public Cuke cutCuke() {
        System.out.println("动物工厂切黄瓜");
        return new Cuke();
    }

    @Override
    public Potato cutPotato() {
        System.out.println("动物工厂切土豆");
        return new Potato();
    }


}
