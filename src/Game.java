import javax.swing.*;

public class Game extends JFrame{
    private JPanel mainPan;
    private JButton qButton;
    private JButton wButton;
    private JButton eButton;

    public static void main(String[] args) {
        Game c = new Game();
        c.setContentPane(c.mainPan);
        c.setTitle("Text");
        c.setSize(600,700);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
