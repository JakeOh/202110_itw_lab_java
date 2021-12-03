package edu.java.inner03;

// 외부 클래스(outer/enclosing class)
public class EnclosingCls {
	// 멤버 변수
	private int instanceVar; // 인스턴스 변수 - 생성자 호출 이후에 메모리(Heap)에 생성되는 변수
	public static int classVar = 100; // static 변수(클래스 변수) - 프로그램 로딩 시점(main 메서드 시작 전)에 메모리(Method)에 생성되는 변수 
	
	// 생성자
	public EnclosingCls(int instanceVar) {
		this.instanceVar = instanceVar;
	}
	
	// 메서드
	// 인스턴스 메서드(static이 아닌 메서드, 인스턴스가 생성되어야만 사용할 수 있는 메서드)
	public void printMembers() {
		System.out.println("--- 인스턴스 메서드 호출 ---");
		System.out.println("인스턴스 변수 = " + instanceVar);
		System.out.println("클래스 변수 = " + classVar);
	}
	
	// 클래스 메서드(static 메서드, 인스턴스 생성 전에도 사용할 수 있는 메서드)
	public static void staticMethod() {
		System.out.println("--- 클래스 메서드 호출 ---");
//		System.out.println("인스턴스 변수 = " + instanceVar);
		// -> static 메서드 안에서는 static이 아닌 멤버는 사용할 수 없다!
		System.out.println("클래스 변수 = " + classVar);
	}

} // end class EnclosingCls
