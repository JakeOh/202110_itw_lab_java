package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	
	private static final int MAX_LENGTH = 3; // 배열의 크기
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열
	private int count = 0; // 현재까지 배열에 저장된 연락처의 개수
	
	// private static으로 자기자신 타입의 변수를 선언.
	private static ContactDaoImpl instance = null;
	
	// 생성자를 private으로 선언.
	private ContactDaoImpl() {}
	
	// 생성자 대신에 인스턴스를 생성할 수 있는 public static 메서드를 제공.
	public static ContactDaoImpl getInstance() {
		if (instance  == null) {
			// instance가 null인 경우에만 생성자를 호출
			instance = new ContactDaoImpl();
		}
		
		return instance;
	}
	

	@Override
	public Contact[] select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact select(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Contact c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int index, Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

}
