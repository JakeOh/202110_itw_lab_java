package edu.java.inheritance06;

public class InheritanceMain06 {

	public static void main(String[] args) {
		// Object 클래스의 메서드 override: toString(), hashCode(), equals(), ...

		Point pt1 = new Point();
		// 자바의 모든 클래스는 Object를 상속받기 때문에, Object 클래스의 public 메서드들을 사용할 수 있음.
		System.out.println(pt1.getClass());
		System.out.println(pt1.hashCode());
		System.out.println(pt1.toString());
		System.out.println(pt1);
		// System.out.println(Object) 메서드는 파라미터에 전달된 객체에서 toString() 메서드를 호출하고,
		// 그 객체의 toString() 메서드가 리턴해 주는 문자열을 콘솔창에 출력.
		// -> 클래스를 작성할 때 toString() 메서드를 override하면 출력문의 형식을 바꿀 수 있음.
		
	}

} // end class InheritanceMain06

class Point {
	
} // end class Point
