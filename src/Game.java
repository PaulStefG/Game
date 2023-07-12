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
    private JLabel Lose;
    public DataB dataB = new DataB();
    public String cuvant;
    public Character[] cuvantDisp, characterCuv;
    public int life = 3;

    public Game() {
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                life=3;
                lifeCount.setText(Integer.toString(life));
                text.setText("");
                Random rand = new Random();
                int n = rand.nextInt(dataB.cuvinte.length);
                cuvant = dataB.cuvinte[n];
                characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                cuvantDisp=characterCuv;
                Lose.setText("");
                Q.setEnabled(true);A.setEnabled(true);Z.setEnabled(true);E.setEnabled(true);D.setEnabled(true);
                C.setEnabled(true);R.setEnabled(true);F.setEnabled(true);V.setEnabled(true);T.setEnabled(true);
                G.setEnabled(true);B.setEnabled(true);Y.setEnabled(true);H.setEnabled(true);N.setEnabled(true);
                U.setEnabled(true);J.setEnabled(true);M.setEnabled(true);I.setEnabled(true);K.setEnabled(true);
                O.setEnabled(true);L.setEnabled(true);P.setEnabled(true);X.setEnabled(true);S.setEnabled(true);W.setEnabled(true);
                for(int i = 0; i < characterCuv.length; i++) {

                    if (i == 0) {
                        text.setText(text.getText() + Character.toString(characterCuv[i]) + " ");
                        cuvantDisp[0]=characterCuv[0];
                    }
                    else if (i == characterCuv.length - 1) {
                        text.setText(text.getText() + Character.toString(characterCuv[i]));
                        cuvantDisp[i]=characterCuv[i];
                    }
                    else {
                        text.setText(text.getText() + " _ ");
                        cuvantDisp[i]='_';
                    }

                }

                characterCuv = cuvant.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
            }
        });
        A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                for(int i = 0; i < characterCuv.length;i++){
                    if(characterCuv[i].equals('a')){
                        cuvantDisp[i]='a';
                    }
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('a')){
                            have=true;
                        }
                    }
                    if(have){
                        A.setEnabled(false);
                    }
                    else{
                        A.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }

                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('q')){
                            have=true;
                        }
                    }
                    if(have){
                        Q.setEnabled(false);
                    }
                    else{
                        Q.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('z')){
                            have=true;
                        }
                    }
                    if(have){
                        Z.setEnabled(false);
                    }
                    else{
                        Z.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('w')){
                            have=true;
                        }
                    }
                    if(have){
                        W.setEnabled(false);
                    }
                    else{
                        W.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('s')){
                            have=true;
                        }
                    }
                    if(have){
                        S.setEnabled(false);
                    }
                    else{
                        S.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('x')){
                            have=true;
                        }
                    }
                    if(have){
                        X.setEnabled(false);
                    }
                    else{
                        X.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('e')){
                            have=true;
                        }
                    }
                    if(have){
                        E.setEnabled(false);
                    }
                    else{
                        E.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('d')){
                            have=true;
                        }
                    }
                    if(have){
                        D.setEnabled(false);
                    }
                    else{
                        D.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('c')){
                            have=true;
                        }
                    }
                    if(have){
                        C.setEnabled(false);
                    }
                    else{
                        C.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('r')){
                            have=true;
                        }
                    }
                    if(have){
                        R.setEnabled(false);
                    }
                    else{
                        R.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('f')){
                            have=true;
                        }
                    }
                    if(have){
                        F.setEnabled(false);
                    }
                    else{
                        F.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('v')){
                            have=true;
                        }
                    }
                    if(have){
                        V.setEnabled(false);
                    }
                    else{
                        V.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('t')){
                            have=true;
                        }
                    }
                    if(have){
                        T.setEnabled(false);
                    }
                    else{
                        T.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('g')){
                            have=true;
                        }
                    }
                    if(have){
                        G.setEnabled(false);
                    }
                    else{
                        G.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('b')){
                            have=true;
                        }
                    }
                    if(have){
                        B.setEnabled(false);
                    }
                    else{
                        B.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('y')){
                            have=true;
                        }
                    }
                    if(have){
                        Y.setEnabled(false);
                    }
                    else{
                        Y.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('h')){
                            have=true;
                        }
                    }
                    if(have){
                        H.setEnabled(false);
                    }
                    else{
                        H.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('n')){
                            have=true;
                        }
                    }
                    if(have){
                        N.setEnabled(false);
                    }
                    else{
                        N.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('u')){
                            have=true;
                        }
                    }
                    if(have){
                        U.setEnabled(false);
                    }
                    else{
                        U.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('j')){
                            have=true;
                        }
                    }
                    if(have){
                        J.setEnabled(false);
                    }
                    else{
                        J.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('m')){
                            have=true;
                        }
                    }
                    if(have){
                        M.setEnabled(false);
                    }
                    else{
                        M.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('i')){
                            have=true;
                        }
                    }
                    if(have){
                        I.setEnabled(false);
                    }
                    else{
                        I.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('k')){
                            have=true;
                        }
                    }
                    if(have){
                        K.setEnabled(false);
                    }
                    else{
                        K.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('o')){
                            have=true;
                        }
                    }
                    if(have){
                        O.setEnabled(false);
                    }
                    else{
                        O.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('l')){
                            have=true;
                        }
                    }
                    if(have){
                        L.setEnabled(false);
                    }
                    else{
                        L.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+ Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }
                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                        count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
                }
                boolean have=false;
                if(!have) {
                    for (int i = 0; i < characterCuv.length; i++) {
                        if(characterCuv[i].equals('p')){
                            have=true;
                        }
                    }
                    if(have){
                        P.setEnabled(false);
                    }
                    else{
                        P.setEnabled(false);
                        life-=1;
                        lifeCount.setText(Integer.toString(life));
                    }
                }
                for (int i = 0; i < cuvantDisp.length; i++){
                    if(i==0){
                        text.setText(text.getText() + Character.toString(cuvantDisp[i]));
                    }
                    else if (i == cuvantDisp.length-1) {
                        text.setText(text.getText() +" "+Character.toString(cuvantDisp[i]));
                    }
                    else {
                        text.setText(text.getText()+" " + cuvantDisp[i]);
                    }
                }
                if(life==0){
                    Lose.setText("YOU LOSE!!!");
                    text.setText("");
                    text.setText(cuvant);
                }

                int count = 0;
                for (int i = 0; i < characterCuv.length; i++){
                    if(cuvantDisp[i]==characterCuv[i]){
                            count+=1;
                    }
                }
                if(count==characterCuv.length) {
                    Lose.setText("YOU WIN!!");
                    Q.setEnabled(false);A.setEnabled(false);Z.setEnabled(false);E.setEnabled(false);
                    D.setEnabled(false);C.setEnabled(false);R.setEnabled(false);F.setEnabled(false);
                    V.setEnabled(false);T.setEnabled(false);G.setEnabled(false);B.setEnabled(false);
                    Y.setEnabled(false);H.setEnabled(false);N.setEnabled(false);U.setEnabled(false);
                    J.setEnabled(false);M.setEnabled(false);I.setEnabled(false);K.setEnabled(false);
                    O.setEnabled(false);L.setEnabled(false);P.setEnabled(false);X.setEnabled(false);
                    S.setEnabled(false);W.setEnabled(false);
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
