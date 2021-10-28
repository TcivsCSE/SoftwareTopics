import javax.swing.*;
import java.awt.event.KeyEvent;

public class Gameframe extends JFrame {
        Gameframe()
        {
                this.add( new gamePanel());
                this.setTitle("snake");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.setBug(true);
                this.pack();
                this.setVisible(true);
                this.setLocationRelativeTo(null);
        }

}
