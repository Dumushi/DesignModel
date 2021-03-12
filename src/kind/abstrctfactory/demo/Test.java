package kind.abstrctfactory.demo;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/5 9:45
 */
public class Test {

    public static void main(String[] args) {
        Factory animalFactory = new AnimalFactory();
        Pig pig = animalFactory.killPig();
        pig.run();
        Turtle turtle = animalFactory.killTurtle();
        turtle.run();

        Factory plantFactory = new PlantFactory();
        Cuke cuke = plantFactory.cutCuke();
        cuke.color();
        Potato potato = plantFactory.cutPotato();
        potato.color();
    }

}
