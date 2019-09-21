package Tuan2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai5 extends JFrame {
    public Bai5(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pnBoder=new JPanel();
        pnBoder.setLayout(new BorderLayout());

        JPanel pnNorth =new JPanel();
        pnNorth.setBackground(Color.GRAY);

        JLabel lb1=new JLabel("QUADRATIC EQUATION 2");
        Font font =new Font("arial",Font.BOLD,25);
        lb1.setFont(font);
        lb1.setForeground(Color.BLUE);
        pnNorth.add(lb1);
        pnBoder.add(pnNorth,BorderLayout.NORTH);

        JPanel pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        Border bor=BorderFactory.createLineBorder(Color.red);
        TitledBorder titledBorder=new TitledBorder(bor,"Import a,b,c : ");
        pnCenter.setBorder(titledBorder);

        JPanel pna=new JPanel();
        JLabel lbA=new JLabel("a :");
        JTextField txtNumA= new JTextField(10);
        pna.add(lbA); pna.add(txtNumA);
        pnCenter.add(pna);

        JPanel pnb=new JPanel();
        JLabel lbB=new JLabel("b :");
        JTextField txtNumB= new JTextField(10);
        pnb.add(lbB); pnb.add(txtNumB);
        pnCenter.add(pnb);

        JPanel pnc=new JPanel();
        JLabel lbC=new JLabel("c :");
        JTextField txtNumC= new JTextField(10);
        pnc.add(lbC);pnc.add(txtNumC);
        pnCenter.add(pnc);

        JPanel pnkq=new JPanel();
        JLabel kq=new JLabel("Result :");
        JTextField txtKetqua=new JTextField(10);
        txtKetqua.setEnabled(false);
        pnkq.add(kq); pnkq.add(txtKetqua);
        pnCenter.add(pnkq);
        pnBoder.add(pnCenter,BorderLayout.CENTER);

        JPanel pnSouth=new JPanel();
        TitledBorder tbd=new TitledBorder(bor,"Choose :");
        pnSouth.setBorder(tbd);
        pnSouth.setLayout(new FlowLayout());
        JButton btnGiai=new JButton("Calculate");
        JButton btnXoaTrang=new JButton("Clear all");
        JButton btnThoat=new JButton("Exit");
        pnSouth.add(btnGiai);pnSouth.add(btnXoaTrang);pnSouth.add(btnThoat);
        pnBoder.add(pnSouth,BorderLayout.SOUTH);

        //button Calculate
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double a = Double.parseDouble(txtNumA.getText());
                double b = Double.parseDouble(txtNumB.getText());
                double c = Double.parseDouble(txtNumC.getText());
                double delta = Math.pow(b, 2) - ( 4 * a * c );
                double x1, x2;
                if (a == 0) {
                    if(b == 0) {
                        if(c == 0)
                            txtKetqua.setText("Pt co vo so nghiem");
                        else
                            txtKetqua.setText("Pt vo nghiem");
                    }
                    else
                        txtKetqua.setText("x = " + (-c / b));
                }
                else if (delta < 0)
                    txtKetqua.setText("Pt vo nghiem");
                else if (delta == 0)
                    txtKetqua.setText("Pt co nghiem kep x = " + (- b / 2 * a));
                else {
                    x1 = (- b + Math.sqrt(delta) / (2 * a));
                    x2 = (- b - Math.sqrt(delta) / (2 * a));
                    txtKetqua.setText("Pt co 2 nghiem phan biet: x1 = " + x1 + " ; x2 = " + x2);
                }
            }
        });
        
        //button Clear All
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtNumA.setText("");
                txtNumB.setText("");
                txtNumC.setText("");
                txtKetqua.setText("");
            }
        });

        //button Exit
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        add(pnBoder);
    }

    public static void main(String[] args) {
        Bai5 frame = new Bai5();
        frame.setSize(400,350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}