package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AppMain04 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelMessage = new JLabel("New label");
		labelMessage.setFont(new Font("D2Coding", Font.BOLD, 32));
		labelMessage.setBounds(12, 10, 410, 61);
		frame.getContentPane().add(labelMessage);
		
		JButton btn1 = new JButton("익명클래스");
		btn1.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn1.setBounds(12, 81, 190, 61);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("람다표현식");
		btn2.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn2.setBounds(214, 81, 190, 61);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("메서드 1");
		btn3.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn3.setBounds(12, 152, 190, 61);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("메서드2");
		btn4.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn4.setBounds(214, 152, 190, 61);
		frame.getContentPane().add(btn4);
	}

}
