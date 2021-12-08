package edu.java.swing09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class AppMain09 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private JCheckBox cbAbstract;
	private JCheckBox cbStatic;
	private JCheckBox cbFinal;
	private JComboBox comboBox;
	private JButton btnConfirm;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain09 window = new AppMain09();
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
	public AppMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 765, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPrivate.setBounds(8, 6, 148, 49);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPackage.setBounds(160, 6, 148, 49);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbProtected.setBounds(312, 6, 148, 49);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPublic.setBounds(464, 6, 148, 49);
		frame.getContentPane().add(rbPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbAbstract.setBounds(8, 78, 148, 49);
		frame.getContentPane().add(cbAbstract);
		
		cbStatic = new JCheckBox("static");
		cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbStatic.setBounds(160, 78, 148, 49);
		frame.getContentPane().add(cbStatic);
		
		cbFinal = new JCheckBox("final");
		cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbFinal.setBounds(312, 78, 148, 49);
		frame.getContentPane().add(cbFinal);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("D2Coding", Font.PLAIN, 24));
		comboBox.setBounds(8, 160, 148, 49);
		frame.getContentPane().add(comboBox);
		
		btnConfirm = new JButton("확인");
		btnConfirm.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnConfirm.setBounds(8, 240, 148, 49);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textArea.setBounds(8, 326, 604, 191);
		frame.getContentPane().add(textArea);
	}
}
