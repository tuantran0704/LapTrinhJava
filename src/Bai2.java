package Tuan2;

import javax.swing.*;
import java.awt.*;

public class Bai2 extends JFrame {
   
	public static void main(String[] args) {
        Bai2 ui = new Bai2();
        ui.setSize(700,150);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    
    public Bai2(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.CYAN);
        JButton btn1 =new JButton("Flow Layout");
        JButton btn2 =new JButton("Add Control");
        JButton btn3 =new JButton("In one row");
        JButton btn4 =new JButton("Full element of row");
        JButton btn5 =new JButton("Down the line");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);

    }

}
