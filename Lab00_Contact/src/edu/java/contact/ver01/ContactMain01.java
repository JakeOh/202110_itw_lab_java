package edu.java.contact.ver01;

import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain01 {
	private static final int MAX_LENGTH = 5;  // 상수 선언
	
	private static Scanner scanner = new Scanner(System.in);
	private static Contact[] contacts = new Contact[MAX_LENGTH];
	private static int count = 0;  // 배열에 현재까지 저장된 연락처 개수

	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.1 ***");
		
		boolean run = true;
		while (run) {
			showMainMenu();
			int menu = scanner.nextInt();  // 콘솔에서 "엔터 키"까지 입력된 정수만 읽고, "엔터"는 버퍼에 남겨둠.
			scanner.nextLine();  // 숫자 뒤에 키보드로 입력한 "엔터"를 버퍼에서 읽고 버림. 
			// -> 숫자 다음에 문자열을 입력받아야 하는 경우, 문자열을 제대로 입력받기 위해서.
			
			switch (menu) {
			case 0: // 프로그램 종료
//				return; // main 메서드를 종료
				run = false;
				break; // switch를 끝냄.
			case 1: // 전체 검색 - 배열에 저장된 모든 연락처 출력
				break;
			case 2: // 인덱스 검색 - 검색하고자 하는 인덱스의 연락처 1개만 출력
				break;
			case 3: // 연락처 추가
				insertConctact();
				break;
			case 4: // 연락처 업데이트
				break;
			default:
			} // end switch
		} // end while

		System.out.println("*** 프로그램 종료***");
	} // end main()

	private static void insertConctact() {
		System.out.println();
		System.out.println("----- 연락처 추가 -----");
		System.out.println("이름 입력>>>");
		String name = scanner.nextLine(); // 콘솔 창에서 "엔터 키"가 입력될 때까지 입력된 모든 문자열을 입력받음.
		System.out.println("전화번호 입력>>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력>>>");
		String email = scanner.nextLine();
		
		// Contact 클래스의 인스턴스를 생성
		Contact c = new Contact(name, phone, email);
		// 연락처(생성된 객체의 참조값)을 배열에 저장
		contacts[count] = c;
		// 배열에 저장된 연락처의 개수를 1 증가시킴.
		count++;
		
	} // end insertContact()

	private static void showMainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println("선택>>> ");
	} // end showMainMenu()

}  // end class
