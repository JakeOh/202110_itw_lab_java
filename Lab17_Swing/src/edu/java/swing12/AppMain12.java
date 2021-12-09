package edu.java.swing12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AppMain12 {
	
	// 테이블의 컬럼 이름을 상수
	private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"};

	private JFrame frame;
	private JLabel labelKorean;
	private JTextField textKorean;
	private JLabel labelEnglish;
	private JTextField textEnglish;
	private JLabel labelMath;
	private JTextField textMath;
	private JButton btnInput;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel; // 테이블의 데이터(행row, 열column, 셀cell)를 관리(추가, 삭제)하는 클래스
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain12 window = new AppMain12();
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
	public AppMain12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelKorean = new JLabel("국어");
		labelKorean.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelKorean.setBounds(12, 10, 148, 62);
		frame.getContentPane().add(labelKorean);
		
		textKorean = new JTextField();
		textKorean.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textKorean.setBounds(172, 10, 338, 62);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);
		
		labelEnglish = new JLabel("영어");
		labelEnglish.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelEnglish.setBounds(12, 83, 148, 62);
		frame.getContentPane().add(labelEnglish);
		
		textEnglish = new JTextField();
		textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEnglish.setColumns(10);
		textEnglish.setBounds(172, 83, 338, 62);
		frame.getContentPane().add(textEnglish);
		
		labelMath = new JLabel("수학");
		labelMath.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelMath.setBounds(12, 155, 148, 62);
		frame.getContentPane().add(labelMath);
		
		textMath = new JTextField();
		textMath.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textMath.setColumns(10);
		textMath.setBounds(172, 155, 338, 62);
		frame.getContentPane().add(textMath);
		
		btnInput = new JButton("점수 입력");
		btnInput.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnInput.setBounds(12, 227, 148, 62);
		frame.getContentPane().add(btnInput);
		
		btnDelete = new JButton("행 삭제");
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnDelete.setBounds(172, 227, 148, 62);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 299, 498, 156);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		// 테이블에 테이블 모델을 설정
		tableModel = new DefaultTableModel(null, COLUMN_NAMES);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
	}
}
