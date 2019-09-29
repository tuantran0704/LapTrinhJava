package Lab1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;

public class Bai2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel() {
			// File ảnh trên github
			//ImageIcon icon = new ImageIcon("/home/tuantran0704/git/LapTrinhJava/src/img/865098.jpg");     
			ImageIcon icon = new ImageIcon("D:/Users/GIT/Downloads/LapTrinhUngDungJava/img/865098.jpg");
			public void paintComponent(Graphics g){ 
		        Dimension d = getSize(); 
		        g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);         
		        setOpaque(false);         
		        super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
