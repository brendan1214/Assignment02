
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot bot = new Robot(kw,32,17,Direction.SOUTH);
       
        while(bot.getDirection()!=Direction.NORTH){   
            bot.turnLeft();
        }
        
        while(bot.getStreet()>0){
            bot.move();
        }
    
        while(bot.getDirection()!=Direction.WEST){
            bot.turnLeft();
        }
        while(bot.getAvenue()>0){
            bot.move();
        }
         
    
    }
}
