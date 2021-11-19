package edu.java.member.view;

import edu.java.member.model.Member;

// 클래스나 인터페이스에서 선언된 public static 멤버 변수 이름을 import하는 방법:
import static edu.java.member.view.MainMenu.*;

// MVC(Model-View-Controller) 디자인 패턴
// Model: 데이터 저장을 위한 클래스. VO(Value Object), DTO(Data Transfer Object).
// - edu.java.member.model.Member
// View: UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller: 프로그램의 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Obejct).
// - edu.java.member.controller.MemberDao, MemberDaoImpl
// - 인터페이스와 구현 클래스로 나눔.
// - 구현 클래스는 Singleton 디자인 패턴으로 설계.

public class MemberMain {

	public static void main(String[] args) {
		// 회원 관리 프로그램 메인(View)
		System.out.println("*** 회원 관리 프로그램 ***");
		
		boolean run = true;
		while (run) {
			// 메인 메뉴를 보여주고, 메뉴 선택을 입력
			int menu = 0;
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				// TODO:
				break;
			case SELECT_BY_INDEX:
				// TODO:
				break;
			case INSERT:
				// TODO:
				break;
			case UPDATE:
				// TODO:
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");
			} // end switch
			
		} // end while

		System.out.println("*** 회원 관리 프로그램 종료 ***");
	} // end main()

} // end class MemberMain
