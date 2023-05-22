import javax.swing.*;
class Jframe extends JFrame {
    Jframe(){
        this.setTitle("Snake Game");
        this.add(new Jpanel());
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}