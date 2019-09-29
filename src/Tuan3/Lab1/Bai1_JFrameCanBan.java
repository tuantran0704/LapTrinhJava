package Lab1;

import java.awt.Color;

import javax.swing.JFrame;

public class Bai1_JFrameCanBan extends JFrame {
	public Bai1_JFrameCanBan() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JFrame Căn Bản");
		setSize(600,400);
	}
	
	public static void main(String[] args) {
		new Bai1_JFrameCanBan();
	}
}
