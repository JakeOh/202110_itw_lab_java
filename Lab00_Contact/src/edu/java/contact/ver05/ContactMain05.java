package edu.java.contact.ver05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;
import edu.java.contact.ver04.ContactDao;
import edu.java.contact.ver04.ContactDaoImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactMain05 {
	
	// 메인 화면에서 보여줄 테이블의 컬럼 이름
	private static final String[] COLUMN_NAMES_SHORT = {"이름", "전화번호"};
	private static final String[] COLUMN_NAMES_LONG = {"이름", "전화번호", "이메일"};

	// Controller 역할을 하는 변수
	private ContactDao dao;
	
	private JFrame frame;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
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
	public ContactMain05() {
		dao = ContactDaoImpl.getInstance(); // controller singleton
		initialize(); // UI 컴포넌트 초기화
		loadContactData(); // 파일에 저장된 연락처 데이터를 로딩해서 테이블로 보여주기
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("연락처 프로그램 Ver0.6");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		
		JButton btnInsert = new JButton("추가");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContactInsertFrame.showFrame(frame, ContactMain05.this);
			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 24));
		buttonPanel.add(btnInsert);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("D2Coding", Font.PLAIN, 24));
		buttonPanel.add(btnSearch);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 24));
		buttonPanel.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 24));
		buttonPanel.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		
		// 테이블의 데이터들을 관리하는 DefaultTableModel 객체를 생성하고, 테이블에 세팅(설정).
		model = new DefaultTableModel(null, COLUMN_NAMES_SHORT);
		table.setModel(model);
		
		scrollPane.setViewportView(table);
	} // end initialize()
	
	private void loadContactData() {
		// data/contacts.dat  파일에서 데이터를 읽어서 JTable에 데이터를 추가(JTable의 model을 변경)
		List<Contact> contacts = dao.select();
		for (Contact c : contacts) {
			addContactToTableModel(c);
		}
		
	} // end loadContactData()
	
	private void addContactToTableModel(Contact c) {
		String[] rowData = {c.getName(), c.getPhone()}; // JTable의 행(row)에 삽입될 데이터
		model.addRow(rowData);
		
	} // end addContactToTableModel()

	public void insertConcat(Contact c) {
		// 파일에 쓰기 -> 팝업창
		int result = dao.insert(c);
		if (result == 1) {
			// JTable 업데이트
			addContactToTableModel(c);
			
			// 성공 팝업
			JOptionPane.showMessageDialog(frame, "새 연락처가 추가됐습니다... ^^");
		}
		
	} // end insertContact()

} // end class ContactMain05
