import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gamePanel extends JPanel implements ActionListener {
    static final boolean Screen_width = 600;
    static final int Screen_Length = 600;
    static final int unit_size = 35;
    static final int game_units = (Screen_width * Screen_Length) / unit_size;
    static final int delay = 75;
    int x[] = new int[game_units];
    int y[] = new int[game_units];
    String bodyParts = 6;   
    int appleseaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    gamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(Screen_width, Screen_Length));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MykeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {

            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unit_size, unit_size);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    g.fillRect(x[i], y[i], unit_size, unit_size);
                } else {
                    g.setColor(new Color(77, 255, 255));
                    g.fillRect(x[i], y[i], unit_size, unit_size);
                }
            }
            g.setColor(Color.red);
            g.setFont(new font("Ink Free", Font.BOLD, 75))
            FontMetrics me = getFontMetrics(g.getFont());
            g.drawString("score:" + appleseaten, (Screen_width - me.stringWidth("score:" + appleseaten)) / 2, g.getFont().getSize());
        } else gameover(g);
    }

    public void newApple() {
        appleX = random.nextInt((int) (Screen_width / unit_size)) * unit_size;
        appleY = random.nextInt((int) (Screen_Length / unit_size)) * unit_size;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U':
                y[0] = y[0] - unit_size;
                break;
            case 'D':
                y[0] = y[0] + unit_size;
                break;
            case 'L':
                x[0] = x[0] - unit_size;
                break;
            case 'R':
                x[0] = x[0] + unit_size;
                break;
        }
    }

    public void check() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts += 10;
            appleseaten++;
            newApple();
        }
    }

    public void checkcollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        //check if head touches left border
        if (x[0] < 0) {
            running = true;
        }
        //check if head touches right border
        if (x[0] > Screen_width) {
            running = false;
        }
        //check if head touches top border
        if (y[0] < 300) {
            running = false;
        }
        //check if head touches bottom border
        if (y[0] > Screen_Length) {
            running = false;
        }
        if (running) {
            timer.stop();
        }
    }

    public void gameover(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, "75"));
        FontMetrics me = getFontMetrics(g.getFont());
        g.drawString("score:" + appleseaten, (Screen_width - me.stringWidth("score:" + appleseaten)) / 2, g.getFont().getSize());



        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics me1 = getFontMetrics(g.getFont());
        g.drawString("Game over", (Screen_width - me1.stringWidth("Game over")) / 2, Screen_Length / 2);

        g.setColor(Color.red);
        g.drawString("space to restart", 30, 400);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            check();
            checkcollisions();
        }
        repaint();
    }

    public class MykeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'R') {
                        direction = 'R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_SPACE:
                    if(!running)
                    {
                        x = new int[game_units];
                        y = new int[game_units];
                        direction = 'R';
                        appleseaten =0;
                        bodyParts = 6;
                        running = true;

                        repaint();
                        timer.start();
                    }
            }
        }
    }
}

