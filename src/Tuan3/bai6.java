package Tuan3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class bai6 extends JFrame {

	private long a = 0;
	private String phepToan = "";
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai6 frame = new bai6("Calculator");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param title 
	 */
	public bai6(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GRAY);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 580, 429);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHienThi = new JLabel("0 ");
		lblHienThi.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY));
		lblHienThi.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHienThi.setFont(new Font("Arial", Font.BOLD, 50));
		lblHienThi.setForeground(Color.WHITE);
		lblHienThi.setBounds(0, 0, 315, 75);
		panel.add(lblHienThi);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 76, 313, 350);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 2, 2, 2));
		panel_1.setBackground(Color.GRAY);

		//CE
		JButton btnXoa1 = new JButton("CE");
		btnXoa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblHienThi.setText("0");
			}
		});
		panel_1.add(btnXoa1);
		btnXoa1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa1.setBackground(Color.DARK_GRAY);
		btnXoa1.setForeground(Color.WHITE);
		
		//C
		JButton btnXoa = new JButton("C");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblHienThi.setText("0");
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnXoa);
		btnXoa.setBackground(Color.DARK_GRAY);
		btnXoa.setForeground(Color.WHITE);
		
		
		//SQRT
		JButton btnSqrt = new JButton("SQRT");
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnSqrt);
		btnSqrt.setBackground(Color.DARK_GRAY);
		btnSqrt.setForeground(Color.WHITE);

		
		// "/"
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "/";
					lblHienThi.setText("0");
				}
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnChia);
		btnChia.setBackground(Color.DARK_GRAY);
		btnChia.setForeground(Color.WHITE);

		
		//7
		JButton btnSo7 = new JButton("7");
		btnSo7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo7.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo7);
		btnSo7.setBackground(Color.BLACK);
		btnSo7.setForeground(Color.WHITE);

		
		//8
		JButton btnSo8 = new JButton("8");
		btnSo8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo8.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo8.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo8);
		btnSo8.setBackground(Color.BLACK);
		btnSo8.setForeground(Color.WHITE);
		
		
		//9
		JButton btnSo9 = new JButton("9");
		btnSo9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo9.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo9.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo9);
		btnSo9.setBackground(Color.BLACK);
		btnSo9.setForeground(Color.WHITE);

		
		// "X"
		JButton btnNhan = new JButton("X");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "*";
					lblHienThi.setText("0");
				}
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnNhan);
		btnNhan.setBackground(Color.DARK_GRAY);
		btnNhan.setForeground(Color.WHITE);
		
		
		//4
		JButton btnSo4 = new JButton("4");
		btnSo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo4.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo4);
		btnSo4.setBackground(Color.BLACK);
		btnSo4.setForeground(Color.WHITE);

		
		//5
		JButton btnSo5 = new JButton("5");
		btnSo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo5.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo5.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo5);
		btnSo5.setBackground(Color.BLACK);
		btnSo5.setForeground(Color.WHITE);

		
		//6
		JButton btnSo6 = new JButton("6");
		btnSo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo6.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo6.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo6);
		btnSo6.setBackground(Color.BLACK);
		btnSo6.setForeground(Color.WHITE);

		
		// "-"
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "-";
					lblHienThi.setText("0");
				}
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnTru);
		btnTru.setBackground(Color.DARK_GRAY);
		btnTru.setForeground(Color.WHITE);

		
		//1
		JButton btnSo1 = new JButton("1");
		btnSo1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo1.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo1);
		btnSo1.setBackground(Color.BLACK);
		btnSo1.setForeground(Color.WHITE);

		
		//2
		JButton btnSo2 = new JButton("2");
		btnSo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo2.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo2.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo2);
		btnSo2.setBackground(Color.BLACK);
		btnSo2.setForeground(Color.WHITE);

		//3
		JButton btnSo3 = new JButton("3");
		btnSo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo3.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo3.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo3);
		btnSo3.setBackground(Color.BLACK);
		btnSo3.setForeground(Color.WHITE);

		
		// "+"
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "+";
					lblHienThi.setText("0");
				}
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnCong);
		btnCong.setBackground(Color.DARK_GRAY);
		btnCong.setForeground(Color.WHITE);

		
		// "+/-"
		JButton btnCongTru = new JButton("+/-");
		btnCongTru.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnCongTru);
		btnCongTru.setBackground(Color.DARK_GRAY);
		btnCongTru.setForeground(Color.WHITE);

		
		//0
		JButton btnSo0 = new JButton("0");
		btnSo0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo0.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo0.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_1.add(btnSo0);
		btnSo0.setBackground(Color.BLACK);
		btnSo0.setForeground(Color.WHITE);

		
		// "%"
		JButton btnPhanTram = new JButton("%");
		btnPhanTram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "%";
					lblHienThi.setText("0");
				}
			}
		});
		btnPhanTram.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnPhanTram);
		btnPhanTram.setBackground(Color.DARK_GRAY);
		btnPhanTram.setForeground(Color.WHITE);

		
		// "="
		JButton btnBang = new JButton("=");
		btnBang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (phepToan.length() > 0) {
					long b = Long.parseLong(lblHienThi.getText());
					if (phepToan.equals("+")) {
						long kq = a + b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("-")) {
						long kq = a - b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("*")) {
						long kq = a * b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("/")) {
						float kq = (float) a / b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("%")) {
						float kq = a % b;
						lblHienThi.setText(String.valueOf(kq));
					}
					phepToan = "";
					a = 0;
				}
			}
		});
		btnBang.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnBang);
		btnBang.setBackground(Color.DARK_GRAY);
		btnBang.setForeground(Color.WHITE);
	}
}