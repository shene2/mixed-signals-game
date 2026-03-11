import javax.swing.JFrame;

public class GameWindow {

    JFrame frame;

    public GameWindow(){

        frame = new JFrame("Mixed Signals");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);

        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.setVisible(true);
    }

}