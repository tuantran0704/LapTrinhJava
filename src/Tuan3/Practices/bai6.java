package Practices;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class bai6 extends JFrame {
	private static final long serialVersionUID = 1L;
	public bai6(String title)
	{
		setTitle(title);
	}
	public void doShow()
	{
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addControl();
		setResizable(false);
		setVisible(true);
	}	
	public void addControl()
	{
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth=new JPanel();
		JLabel lblTitle=new JLabel("Addition Subtraction Multiplication Division");
		pnNorth.setBackground(Color.ORANGE);
		pnNorth.add(lblTitle);
		pnBorder.add(pnNorth,BorderLayout.NORTH);
		lblTitle.setForeground(Color.BLUE);
		Font ft=new Font("arial", Font.BOLD, 25);
		lblTitle.setFont(ft);
		
		JPanel pnWest=new JPanel();
		pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
		JButton btnGiai=new JButton("  Calculate ");
		JButton btnXoa=new JButton("  Clear All   ");
		JButton btnThoat=new JButton("       Exit       ");
		pnWest.add(btnGiai);
		pnWest.add(Box.createVerticalStrut(10));
		pnWest.add(btnXoa);
		pnWest.add(Box.createVerticalStrut(10));
		pnWest.add(btnThoat);
		pnBorder.add(pnWest,BorderLayout.WEST);
		pnWest.setBackground(Color.LIGHT_GRAY);
		
		Border  southborder
		=BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder southTitleBorder=
				new TitledBorder(southborder, "Choose :");
		pnWest.setBorder(southTitleBorder);
		
		JPanel pnSouth=new JPanel();
		pnSouth.setPreferredSize(new Dimension(0, 30));
		pnSouth.setBackground(Color.GRAY);
		JPanel pns1=new JPanel();
		pns1.setBackground(Color.BLUE);
		pnSouth.add(pns1);
		JPanel pns2=new JPanel();
		pns2.setBackground(Color.RED);
		pnSouth.add(pns2);
		JPanel pns3=new JPanel();
		pns3.setBackground(Color.YELLOW);
		pnSouth.add(pns3);
		pnBorder.add(pnSouth,BorderLayout.SOUTH);
		
		JPanel pnCenter=new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		pnCenter.setBackground(Color.LIGHT_GRAY);
		pnBorder.add(pnCenter,BorderLayout.CENTER);
		
		Border  centerborder
		=BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder centerTitleBorder=
				new TitledBorder(centerborder, "Import Number a & b:");
		pnCenter.setBorder(centerTitleBorder);

		JPanel pna=new JPanel();
		JLabel lbla=new JLabel("      a");
		final JTextField txta=new  JTextField(10);
		pna.add(lbla);
		pna.add(txta);
		pnCenter.add(pna);
		
		JPanel pnb=new JPanel();
		JLabel lblb=new JLabel("      b");
		final JTextField txtb=new  JTextField(10);
		pnb.add(lblb);
		pnb.add(txtb);
		pnCenter.add(pnb);
		
		JPanel pnc=new JPanel();
		JPanel pnpheptoan=new JPanel();
		pnpheptoan.setLayout(new GridLayout(2, 2));
		pnpheptoan.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Choose The Operation:"));
		
		final JRadioButton radCong=new JRadioButton("Addition");
		pnpheptoan.add(radCong);
		final JRadioButton radTru=new JRadioButton("Subtraction");
		pnpheptoan.add(radTru);
		final JRadioButton radNhan=new JRadioButton("Multiplication");
		pnpheptoan.add(radNhan);
		final JRadioButton radChia=new JRadioButton("Division");
		pnpheptoan.add(radChia);
		ButtonGroup group=new ButtonGroup();
		group.add(radCong);group.add(radTru);
		group.add(radNhan);group.add(radChia);
		
		pnc.add(pnpheptoan);
		pnCenter.add(pnc);
		
		JPanel pnkq=new JPanel();
		JLabel lblkq=new JLabel("Result :");
		final JTextField txtkq=new  JTextField(15);
		pnkq.add(lblkq);
		pnkq.add(txtkq);
		pnCenter.add(pnkq);
		
		lbla.setPreferredSize(lblkq.getPreferredSize());
		lblb.setPreferredSize(lblkq.getPreferredSize());
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ret=JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
				
				if(ret==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txta.setText("");
				txtb.setText("");
				txtkq.setText("");
				txta.requestFocus();
			}
		});
		
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sa=txta.getText();
				int a=0,b=0;
				try
				{
					a=Integer.parseInt(sa);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Wrong Format!");
					txta.selectAll();
					txta.requestFocus();
					return;
				}
				String sb=txtb.getText();
				try
				{
					b=Integer.parseInt(sb);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Wrong Format!");
					txtb.selectAll();
					txtb.requestFocus();
					return;
				}
				double kq=0;
				if(radCong.isSelected())
				{
					kq=(a+b);
				}
				else if(radTru.isSelected())
				{
					kq=(a-b);
				}
				else if(radNhan.isSelected())
				{
					kq=(a*b);
				}
				else
				{
					kq=a*1.0/b*1.0;
				}
				txtkq.setText(kq+"");
			}
		});
		Container con=getContentPane();
		con.add(pnBorder);
	}
	public static void main(String[] args) {
		bai6 ui=new bai6("Addition - Subtraction - Multiplication - Division");
		ui.doShow();
	}

}