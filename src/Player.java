import java.awt.Graphics;
import java.awt.Color;

public class Player {

    int x = 100;
    int y = 100;
    int size = 30;
    int speed = 5;

    public void moveUp(){
        y -= speed;
    }

    public void moveDown(){
        y += speed;
    }

    public void moveLeft(){
        x -= speed;
    }

    public void moveRight(){
        x += speed;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, size, size);
    }
}