package Tuan2;

import javax.swing.*;
import java.awt.*;

public class Bai3 extends JFrame {
   
    public static void main(String[] args) {
        Bai3 ui=new Bai3();
        ui.setSize(450,250);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
	
	public Bai3(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
        setLayout(new BorderLayout());
        setLayout(new FlowLayout());
        JButton btn1 =new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        Font font=new Font("Arial",Font.BOLD,20);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2 =new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3 =new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);

        Container con=getContentPane();
        con.add(pnBox,BorderLayout.NORTH);

    }

}