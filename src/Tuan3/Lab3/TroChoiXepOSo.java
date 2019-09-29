package Lab3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TroChoiXepOSo extends JFrame {


	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TroChoiXepOSo frame = new TroChoiXepOSo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TroChoiXepOSo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 323, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);

		JLabel lblTen = new JLabel("  TRÒ CHƠI XẾP Ô SỐ");
		lblTen.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblTen.setBounds(10, 13, 330, 50);
		panel.add(lblTen);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1, 340, 322, 61);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.CYAN);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(2, 83, 320, 257);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 4, 4, 4));
		panel_2.setBackground(Color.CYAN);

		JButton btnSo15 = new JButton("15");
		btnSo15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSo15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnSo15);

		JButton btnSo14 = new JButton("14");
		btnSo14.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo14);

		JButton btnSo13 = new JButton("13");
		btnSo13.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo13);

		JButton btnSo12 = new JButton("12");
		btnSo12.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo12);

		JButton btnSo11 = new JButton("11");
		btnSo11.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo11);

		JButton btnSo10 = new JButton("10");
		btnSo10.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo10);

		JButton btnSo9 = new JButton("9");
		btnSo9.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo9);

		JButton btnSo8 = new JButton("8");
		btnSo8.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo8);

		JButton btnSo7 = new JButton("7");
		btnSo7.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo7);

		JButton btnSo6 = new JButton("6");
		btnSo6.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo6);

		JButton btnSo5 = new JButton("5");
		btnSo5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo5);

		JButton btnSo4 = new JButton("4");
		btnSo4.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo4);

		JButton btnSo3 = new JButton("3");
		btnSo3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo3);

		JButton btnSo2 = new JButton("2");
		btnSo2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo2);

		JButton btnSo1 = new JButton("1");
		btnSo1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnSo1);

		JButton btnRong = new JButton("");
		btnRong.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnRong);

		JButton btnBatDau = new JButton("Start");
		btnBatDau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getTitle = JOptionPane.showInputDialog("Nhập Vào Tên Người Chơi !!!");
				setTitle("Player " + getTitle);

			}
		});
		btnBatDau.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBatDau.setBounds(100, 12, 127, 29);
		panel_1.add(btnBatDau);
		
		btnSo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
}}