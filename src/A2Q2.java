
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City Kitchener = new City();

        Robot bot = new Robot(Kitchener, 3, 0, Direction.EAST);

        new Wall(Kitchener, 3, 0, Direction.SOUTH);
        new Wall(Kitchener, 3, 0, Direction.EAST);
        new Wall(Kitchener, 3, 1, Direction.EAST);
        new Wall(Kitchener, 3, 1, Direction.SOUTH);
        new Wall(Kitchener, 3, 2, Direction.SOUTH);
        new Wall(Kitchener, 3, 3, Direction.SOUTH);
        new Wall(Kitchener, 3, 3, Direction.EAST);
        new Wall(Kitchener, 3, 4, Direction.SOUTH);
        new Wall(Kitchener, 3, 5, Direction.SOUTH);
        new Wall(Kitchener, 3, 6, Direction.EAST);
        new Wall(Kitchener, 3, 6, Direction.SOUTH);
        new Wall(Kitchener, 3, 7, Direction.SOUTH);
        new Wall(Kitchener, 3, 8, Direction.SOUTH);
        new Thing(Kitchener, 3, 8);

        while (true) {
            if (!bot.frontIsClear()) {
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
            }

            if (bot.frontIsClear()) {
                bot.move();
            }


            if (bot.canPickThing()) {
                break;
            }






        }

    }
}
