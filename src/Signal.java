import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Signal {

    int x;
    int y;
    int size = 20;

    Random rand = new Random();

    public Signal(){

        x = rand.nextInt(700);
        y = rand.nextInt(500);

    }

    public void draw(Graphics g){

        g.setColor(Color.green);
        g.fillOval(x,y,size,size);

    }

}