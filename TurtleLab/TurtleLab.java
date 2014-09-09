import java.lang.Object;
import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        //Create a world and 3 turtles
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        turtle1.setBodyColor(Color.BLUE);
        turtle2.setBodyColor(Color.ORANGE);
        turtle3.setBodyColor(Color.GREEN);
        
        turtle1.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.ORANGE);
        turtle3.setPenColor(Color.GREEN);
        
        
        //Make flower petals
        turtle1.setPenWidth(3);
        for(int i = 1; i<11;i++) {
            for(int j = 1; j<10;j++) {
            turtle1.forward(100/j);
            turtle1.turn(28);
        }
        }
        turtle1.turn(358);
        turtle1.forward(100);
        
        
        //Make stem and leaf
        turtle3.setPenWidth(3);
        turtle3.forward(87);
        turtle3.backward(140);
        
        turtle3.turn(90);
        turtle3.forward(50);
        turtle3.turn(90);
        turtle3.forward(25);
        turtle3.turn(90);
        turtle3.forward(50);
        turtle3.turn(90);
        turtle3.forward(12);
        turtle3.turn(90);
        turtle3.forward(35);
        turtle3.backward(35);
        turtle3.turn(270);
        turtle3.forward(13);
        
        turtle3.turn(180);
        for(int i = 1; i<18;i++) {
            turtle3.forward(8);
            turtle3.turn(2);
        }
        
        //Make Brown Dirt
        Color color1 = new Color(150,100,100);
        turtle3.setBodyColor(color1);
        turtle3.setPenColor(color1);
        turtle3.turn(56);
        turtle3.forward(1000);
        turtle3.backward(2000);
        
        //Make orange and cyan center
        turtle2.setPenWidth(25);
        turtle2.penUp();
        turtle2.forward(110);
        turtle2.penDown();
        turtle2.turn(90);
        for(int i = 1; i<30;i++) {
            turtle2.forward(5);
            turtle2.turn(12);
        }
        turtle2.penUp();
        turtle2.turnRight();
        turtle2.forward(12);
        turtle2.turnLeft();
        turtle2.setPenColor(Color.CYAN);
        turtle2.setPenWidth(16);
        turtle2.penDown();
        for(int i = 1; i<30;i++) {
            turtle2.forward(5);
            turtle2.turn(28);
        }
    }
}