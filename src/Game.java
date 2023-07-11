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
    public Character[] cuvantB;
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

                for(int i = 0; i < characterCuv.length; i++) {

                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");

                }
            }
        });
        A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('a')){
                        text.setText(text.getText() + " a ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        Q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('q')){
                        text.setText(text.getText() + " q ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        Z.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('z')){
                        text.setText(text.getText() + " z ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        W.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('w')){
                        text.setText(text.getText() + " w ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        S.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('s')){
                        text.setText(text.getText() + " s ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        X.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('x')){
                        text.setText(text.getText() + " x ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        E.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('e')){
                        text.setText(text.getText() + " e ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('d')){
                        text.setText(text.getText() + " d ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('c')){
                        text.setText(text.getText() + " c ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        R.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('r')){
                        text.setText(text.getText() + " r ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        F.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('f')){
                        text.setText(text.getText() + " f ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        V.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('v')){
                        text.setText(text.getText() + " v ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('t')){
                        text.setText(text.getText() + " t ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        G.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('g')){
                        text.setText(text.getText() + " g ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('b')){
                        text.setText(text.getText() + " b ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        Y.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('y')){
                        text.setText(text.getText() + " y ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        H.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('h')){
                        text.setText(text.getText() + " h ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        N.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('n')){
                        text.setText(text.getText() + " n ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        U.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('u')){
                        text.setText(text.getText() + " u ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('j')){
                        text.setText(text.getText() + " j ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        M.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('m')){
                        text.setText(text.getText() + " m ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        I.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('i')){
                        text.setText(text.getText() + " i ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        K.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('k')){
                        text.setText(text.getText() + " k ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        O.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('o')){
                        text.setText(text.getText() + " o ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        L.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('l')){
                        text.setText(text.getText() + " l ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
                }
            }
        });
        P.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Character[] characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                text.setText("");
                for (int i = 0; i < characterCuv.length; i++){
                    if(characterCuv[i].equals('p')){

                        text.setText(text.getText() + " p ");
                    }else {
                        if (i == 0)
                            text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        else if (i == characterCuv.length - 1)
                            text.setText(text.getText() + Character.toString(characterCuv[i]));
                        else
                            text.setText(text.getText() + " _ ");
                    }
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
