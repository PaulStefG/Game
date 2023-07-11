import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame{
    private JPanel mainPan;
    private JButton Q;
    private JButton W;
    private JButton E;
    private JLabel lifeCount;
    private JButton newGameButton;
    private JLabel text;
    private JButton A;
    private JButton Z;
    private JButton S;
    private JButton X;
    private JButton D;
    private JButton C;
    private JButton R;
    private JButton F;
    private JButton V;
    private JButton T;
    private JButton G;
    private JButton B;
    private JButton Y;
    private JButton H;
    private JButton N;
    private JButton U;
    private JButton J;
    private JButton M;
    private JButton I;
    private JButton K;
    private JButton O;
    private JButton L;
    private JButton P;
    public DataB dataB = new DataB();
    public String cuvant;
    public Character[] cuvantDisp, characterCuv;
    public Game() {
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lifeCount.setText("3");
                text.setText("");
                Random rand = new Random();
                int n = rand.nextInt(dataB.cuvinte.length);
                cuvant = dataB.cuvinte[n];
                characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

                for(int i = 0; i < characterCuv.length; i++) {

                        if (i == 0) {
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                            cuvantDisp[0]=characterCuv[i];
                        }
                        else if (i == characterCuv.length - 1) {
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                            cuvantDisp[i] = characterCuv[i];
                        }
                        else {
                            text.setText(text.getText() + "_");
                            cuvantDisp[i]='_';
                        }
                }

            }
        });
        A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('a')){
                        cuvantDisp[i] = 'a';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }

            }
        });
        Q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('q')){
                        cuvantDisp[i] = 'q';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        Z.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('z')){
                        cuvantDisp[i] = 'z';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        W.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('w')){
                        cuvantDisp[i] = 'w';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        S.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('s')){
                        cuvantDisp[i] = 's';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        X.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('x')){
                        cuvantDisp[i] = 'x';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('e')){
                        cuvantDisp[i] = 'e';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('d')){
                        cuvantDisp[i] = 'd';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('c')){
                        cuvantDisp[i] = 'c';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        R.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('r')){
                        cuvantDisp[i] = 'r';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        F.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('f')){
                        cuvantDisp[i] = 'f';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        V.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('v')){
                        cuvantDisp[i] = 'v';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('t')){
                        cuvantDisp[i] = 't';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        G.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('g')){
                        cuvantDisp[i] = 'g';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('b')){
                        cuvantDisp[i] = 'b';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        Y.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('y')){
                        cuvantDisp[i] = 'y';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        H.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('h')){
                        cuvantDisp[i] = 'h';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        N.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('n')){
                        cuvantDisp[i] = 'n';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        U.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('u')){
                        cuvantDisp[i] = 'u';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('j')){
                        cuvantDisp[i] = 'j';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        M.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('m')){
                        cuvantDisp[i] = 'm';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        I.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('i')){
                        cuvantDisp[i] = 'i';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        K.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('k')){
                        cuvantDisp[i] = 'k';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        O.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('o')){
                        cuvantDisp[i] = 'o';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        L.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('l')){
                        cuvantDisp[i] = 'l';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
            }
        });
        P.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('p')){

                        cuvantDisp[i] = 'p';
                    }
                    text.setText(text.getText() + " " + Character.toString(cuvantDisp[i]));
                }
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
