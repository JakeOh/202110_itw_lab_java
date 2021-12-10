package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContactUpdateFrame extends JFrame {

	private JPanel contentPane;
	
	private Component parentComponent;

	/**
	 * Launch the application.
	 * @param frame 
	 */
	// Ctrl+Shift+O: 자동 import
	public static void showFrame(Component parentComponent) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parentComponent);
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
	public ContactUpdateFrame(Component parentComponent) {
		this.parentComponent = parentComponent;
		initialize();
	}
	
	public void initialize() {
		setTitle("연락처 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		int x = parentComponent.getX();
		int y = parentComponent.getY();
		setBounds(x, y, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	} // end initialize()

} // end class ContactUpdateFrame
