import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GamePanel extends JPanel {

    Player player;
    Signal signal;

    public GamePanel(){

        player = new Player();
        signal = new Signal();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setBackground(Color.black);

        player.draw(g);
        signal.draw(g);
    }

}