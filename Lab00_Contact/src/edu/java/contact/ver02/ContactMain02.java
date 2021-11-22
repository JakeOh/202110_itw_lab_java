package edu.java.contact.ver02;

// import static 구문 - 클래스, 인터페이스 안에 있는 static 멤버들의 이름을 import하는 방법
import static edu.java.contact.ver02.MainMenu.*;

import java.util.Scanner;

// MVC 아키텍쳐에서 View에 해당하는 클래스. UI를 담당.
public class ContactMain02 {
	private static Scanner scanner = new Scanner(System.in);
	private static ContactDaoImpl dao = ContactDaoImpl.getInstance();
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.2 ***");
		
		boolean run = true;
		while (run) {
			int menu = chooseMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			default:
			} //  end switch
			
		} // end while

		System.out.println("*** 프로그램 종료 ***");
	} // end main()

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
