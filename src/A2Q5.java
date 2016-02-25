
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        City Kw = new City();
       
       Robot bot = new Robot(Kw,1,3,Direction.SOUTH);
       
       Robot rob = new Robot(Kw,1,3,Direction.SOUTH);
       
       rob.setColor(Color.blue);
       
       bot.setColor(Color.magenta);
       
       new Wall(Kw, 1, 1, Direction.WEST);
       new Wall(Kw, 2, 1, Direction.WEST);
       new Wall(Kw, 3, 1, Direction.WEST);
       new Wall(Kw, 4, 1, Direction.WEST);
       new Wall(Kw, 5, 1, Direction.WEST);
       new Wall(Kw, 6, 1, Direction.WEST);
       new Wall(Kw, 7, 1, Direction.WEST);
       new Wall(Kw, 8, 1, Direction.WEST);
       new Wall(Kw, 9, 1, Direction.WEST);
       new Wall(Kw, 10, 1, Direction.WEST);
       new Wall(Kw, 1, 2, Direction.EAST);
       new Wall(Kw, 2, 2, Direction.EAST);
       new Wall(Kw, 3, 2, Direction.EAST);
       new Wall(Kw, 3, 2, Direction.EAST);
       new Wall(Kw, 4, 2, Direction.EAST);
       new Wall(Kw, 5, 2, Direction.EAST);
       new Wall(Kw, 6, 2, Direction.EAST);
       new Wall(Kw, 7, 2, Direction.EAST);
       new Wall(Kw, 8, 2, Direction.EAST);
       new Wall(Kw, 2, 7, Direction.EAST);
       new Wall(Kw, 3, 7, Direction.EAST);
       new Wall(Kw, 9, 2, Direction.EAST);
       new Wall(Kw, 10, 3, Direction.EAST);
       new Wall(Kw, 10, 2, Direction.EAST);
       new Wall(Kw, 10, 3, Direction.SOUTH);
       new Wall(Kw, 6, 3, Direction.EAST);
       new Wall(Kw, 7, 3, Direction.EAST);
       new Wall(Kw, 4, 3, Direction.EAST);
       new Wall(Kw, 9, 8, Direction.EAST);
       new Wall(Kw, 8, 8, Direction.EAST);
       new Wall(Kw, 1, 3, Direction.EAST);
       new Wall(Kw, 2, 4, Direction.NORTH);
       new Wall(Kw, 2, 5, Direction.NORTH);
       new Wall(Kw, 2, 6, Direction.NORTH);
       new Wall(Kw, 2, 7, Direction.NORTH);
       new Wall(Kw, 2, 4, Direction.NORTH);
       new Wall(Kw, 3, 4, Direction.SOUTH);
       new Wall(Kw, 3, 5, Direction.SOUTH);
       new Wall(Kw, 3, 6, Direction.SOUTH);
       new Wall(Kw, 3, 7, Direction.SOUTH);
       new Wall(Kw, 3, 4, Direction.SOUTH);
       new Wall(Kw, 5, 4, Direction.SOUTH);
       new Wall(Kw, 5, 5, Direction.SOUTH);
       new Wall(Kw, 5, 6, Direction.SOUTH);
       new Wall(Kw, 5, 4, Direction.NORTH);
       new Wall(Kw, 5, 5, Direction.NORTH);
       new Wall(Kw, 5, 6, Direction.NORTH);
       new Wall(Kw, 5, 6, Direction.EAST);
       new Wall(Kw, 8, 4, Direction.NORTH);
       new Wall(Kw, 8, 5, Direction.NORTH);
       new Wall(Kw, 8, 6, Direction.NORTH);
       new Wall(Kw, 8, 7, Direction.NORTH);
       new Wall(Kw, 8, 8, Direction.NORTH);
       new Wall(Kw, 9, 4, Direction.SOUTH);
       new Wall(Kw, 9, 5, Direction.SOUTH);
       new Wall(Kw, 9, 6, Direction.SOUTH);
       new Wall(Kw, 9, 7, Direction.SOUTH);
       new Wall(Kw, 9, 8, Direction.SOUTH);;
       
       new Thing(Kw, 1, 5);
       new Thing(Kw, 1, 4);
       new Thing(Kw, 1, 7);
       new Thing(Kw, 2, 5);
       new Thing(Kw, 2, 4);
       new Thing(Kw, 2, 3);
       new Thing(Kw, 2, 6);
       new Thing(Kw, 2, 8);
       new Thing(Kw, 2, 1);
       new Thing(Kw, 1, 2);
       new Thing(Kw, 3, 1);
       new Thing(Kw, 4, 1);
       new Thing(Kw, 5, 1);
       new Thing(Kw, 8, 1);
       new Thing(Kw, 10, 1);
       new Thing(Kw, 4, 2);
       new Thing(Kw, 6, 2);
       new Thing(Kw, 8, 2);
       new Thing(Kw, 9, 2);
       new Thing(Kw, 10, 2);
       new Thing(Kw, 3, 3);
       new Thing(Kw, 3, 5);
       new Thing(Kw, 3, 7);
       new Thing(Kw, 4, 5);
       new Thing(Kw, 4, 7);
       new Thing(Kw, 5, 3);
       new Thing(Kw, 5, 4);
       new Thing(Kw, 5, 5);
       new Thing(Kw, 5, 7);
       new Thing(Kw, 5, 8);
       new Thing(Kw, 6, 6);
       new Thing(Kw, 6, 8);
       new Thing(Kw, 7, 5);
       new Thing(Kw, 7, 7);
       new Thing(Kw, 8, 8);
       new Thing(Kw, 8, 3);
       new Thing(Kw, 8, 4);
       new Thing(Kw, 9, 5);
       new Thing(Kw, 9, 4);
       new Thing(Kw, 9, 7);
       new Thing(Kw, 10, 5);
       new Thing(Kw, 10, 4);
       new Thing(Kw, 10, 7);

       while(true){
       
       if(bot.getAvenue()==3){    
           bot.move();
           bot.turnLeft();
             }
                
       if(bot.canPickThing()){
           bot.pickThing();
             }
       
       if(bot.frontIsClear()){
          bot.move();
             }
       
       if(!bot.frontIsClear()){
           bot.turnLeft();
           bot.turnLeft();
           bot.turnLeft();
            }
       
       
       
       if(bot.getAvenue()==3){
         if(bot.getStreet()==3) 
             break;
                         }     
            }
      
       bot.turnLeft();
       bot.turnLeft();
       bot.move();
       bot.move();
       bot.turnLeft();  
      
       while(true){
       
       if(bot.frontIsClear()){
           bot.move();       
       }
       if(bot.canPickThing()){
           bot.pickThing();
       }
       if(!bot.frontIsClear()){
           bot.turnLeft();
           bot.turnLeft();
       }
       
       if(bot.getAvenue()==3){
           if(bot.getStreet()==5){
               bot.putThing();
                    break;
       }
       }
       
    
       }
       
       bot.turnLeft();
       bot.turnLeft();
       bot.turnLeft();
       bot.move();
       bot.move(); 
       bot.move();
       bot.turnLeft();
       bot.pickThing();
       
    while(true){
    
    if(bot.frontIsClear()){
        bot.move();
    }
   
    if(!bot.frontIsClear()){
        bot.turnLeft();   
        bot.turnLeft();
        bot.turnLeft();
    }
    
    if(bot.canPickThing()){
        bot.pickThing();
    }
    
    if(bot.getAvenue()==3){
        if(bot.getStreet()==9){
            bot.putThing();
            break;
        }
    }
   } 
    
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    
    
    while(true){
    
    if(rob.frontIsClear()){
        rob.move();
    }
      
    if(rob.canPickThing()){
        rob.pickThing();
    }
    
    if(!rob.frontIsClear()){
        break;
    }  
    
    
    
    }
    
    }

}
    
    
    
    
    
    
    
    
        
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
         
       
       

