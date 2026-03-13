import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements KeyListener{

    Player player;
    Signal signal;

    public GamePanel(){

        player = new Player();
        signal = new Signal();

        setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setBackground(Color.black);

        player.draw(g);
        signal.draw(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_UP){
            player.moveUp();
        }

        if(key == KeyEvent.VK_DOWN){
            player.moveDown();
        }

        if(key == KeyEvent.VK_LEFT){
            player.moveLeft();
        }

        if(key == KeyEvent.VK_RIGHT){
            player.moveRight();
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){}

    @Override
    public void keyTyped(KeyEvent e){}
}