import java.awt.Graphics;
import java.awt.Color;

public class Player {

    int x = 100;
    int y = 100;
    int size = 30;

    public void draw(Graphics g){

        g.setColor(Color.white);
        g.fillRect(x,y,size,size);

    }

}