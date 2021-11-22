package edu.java.contact.ver02;

// import static 구문 - 클래스, 인터페이스 안에 있는 static 멤버들의 이름을 import하는 방법
import static edu.java.contact.ver02.MainMenu.*;

import java.util.Scanner;

import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 View에 해당하는 클래스. UI를 담당.
public class ContactMain02 {
	private static Scanner scanner = new Scanner(System.in);
	private static ContactDao dao = ContactDaoImpl.getInstance();
	// super타입 변수이름 = new sub타입(); -> 다형성(polymorphism) -> 코드의 재사용성을 높임.
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.2 ***");
		
		boolean run = true;
		while (run) {
			int menu = chooseMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				selectAllContacts();
				break;
			case INSERT:
				insertNewContact();
				break;
			default:
				System.out.println("다시 선택하세요...");
			} //  end switch
			
		} // end while

		System.out.println("*** 프로그램 종료 ***");
	} // end main()

	private static void insertNewContact() {
		System.out.println();
		System.out.println("--- 새 연락처 추가 ---");
		System.out.println("이름 입력>>");
		String name = scanner.nextLine();
		System.out.println("전화번호 입력>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력>>");
		String email = scanner.nextLine();
		
		// Controller의 메서드를 사용
		Contact contact = new Contact(name, phone, email);
		int result = dao.insert(contact);
		if (result == 1) {
			System.out.println("새 연락처 추가 성공!!!");
		} else {
			System.out.println("새 연락처 추가 실패...");
		}
	}

	private static void selectAllContacts() {
		System.out.println();
		System.out.println("--- 연락처 전체 리스트 ---");
		// Controller의 메서드를 사용
		Contact[] contactList = dao.select();
		// Controller가 리턴한 내용을 출력
		for (Contact c : contactList) {
			System.out.println(c);
		}
		System.out.println("--------------------------");
	}

	private static int chooseMenu() {
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인덱스검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("------------------------------------------------------");
		System.out.println("선택>>");
		String s = scanner.nextLine();
		int menu = Integer.parseInt(s);
		
		return menu;
	}
	
} // end class ContactMain02
