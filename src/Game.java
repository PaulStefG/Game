import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame{
    private JPanel mainPan;
    private JButton qButton;
    private JButton wButton;
    private JButton eButton;
    private JLabel lifeCount;
    private JButton newGameButton;
    private JLabel text;
    public DataB dataB = new DataB();
    public String cuvant;
    public Game() {
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lifeCount.setText("3");
                text.setText("");
                Random rand = new Random();
                int n = rand.nextInt(dataB.cuvinte.length);
                cuvant = dataB.cuvinte[n];
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText(Character.toString(characterCuv[0]));
                for(int i = 1; i < characterCuv.length-1; i++) {
                    int index = Character.toString(characterCuv[i]).indexOf(' ');
                    if(index !=0){
                        text.setText(text.getText()+" ");
                        i++;
                        index=0;
                    }
                    else {
                        text.setText(text.getText() + " _");
                    }
                }
                int max = characterCuv.length-1;
                text.setText(text.getText()+Character.toString(characterCuv[max]));
            }
        });
    }

    public static void main(String[] args) {
        Game c = new Game();
        c.setContentPane(c.mainPan);
        c.setTitle("Text");
        c.setSize(600,200);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
