package edu.java.inner01;

/*
 * 변수 선언:
 * 1. 필드/멤버 변수(field/member variable): 클래스 안에서 선언하는 변수.
 *    1) 인스턴스 변수: static이 아닌 멤버 변수.
 *       - 인스턴스를 생성한 후에 참조변수를 통해서 접근이 가능한 변수.
 *       - 멤버 변수들은 메모리의 Heap 영역에 생성.
 *    2) 클래스 변수(static 변수): static으로 선언된 멤버 변수.
 *       - Java Runtime이 프로그램을 로딩할 때 class loader에 의해서 메모리(Method 영역)에 생성되는 변수.
 *       - 클래스 이름을 통해서 사용하는 변수.
 * 2. 지역 변수(local variable): 메서드 안에서 선언하는 변수.
 *    - Stack에 생성되는 변수.
 *    - 지역 변수는 선언된 위치에서부터 사용 가능, 지역 변수가 포함된 블록을 벗어나면 자동으로 메모리에서 삭제됨.
 * final을 제외한 수식어들은 멤버 변수에만 사용할 수 있음.
 * 
 */

public class InnerMain01 {
	private int x; // 인스턴스 변수
	static int y; // 클래스 변수(static 변수)

	public static void main(String[] args) {
		int x = 100; // 지역 변수
		// 지역 변수는 선언되어 있고, 초기화되어 있으면 사용 가능.
		System.out.println("x = " + x);
		
//		this.x = 200;
		// -> 인스턴스 (멤버) 변수는 인스턴스를 생성하지 않으면 사용할 수 없음.
		InnerMain01 app = new InnerMain01(); // InnerMain01 클래스 타입의 인스턴스를 생성.
		app.x = 200; // 참조 변수 app을 통해서 인스턴스 변수 x의 값을 변경 또는 출력 ...
		System.out.println("app.x = " + app.x);
		
		// static 변수는 프로그램 로딩 시점에 이미 Method 영역에 생성되고, 초기화까지 이루어짐.
		System.out.println("y = " + InnerMain01.y);
		
	}

}
