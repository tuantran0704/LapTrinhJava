package Tuan2;

import javax.swing.*;

public class Bai1 extends JFrame {
    public Bai1(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Bai1 ui=new Bai1();
        ui.setSize(500,350);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);

    }
}
