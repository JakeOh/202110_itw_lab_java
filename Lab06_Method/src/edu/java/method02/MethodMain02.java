package edu.java.method02;

public class MethodMain02 {

	// method 만들 수 있는 위치
	
	public static void main(String[] args) {
		System.out.println("메서드 선언과 호출 연습");
		
		double result = add(1.1, 2.2);  // add 메서드 호출. argument(1.1, 2.2)를 전달.
		System.out.println(result);

	}  // end main()

	/**
	 * double 타입의 숫자 2개를 argument로 전달받아서, 두 수의 합을 반환(return)하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x + y
	 */
	// [수식어] 타입 이름([파라미터 선언]) { ... }
	public static double add(double x, double y) {
		return x + y;
	}  // end add()
	
	/**
	 * subtract
	 * double 타입 숫자 x와 y를 전달 받아서, x - y를 반환하는 메서드.
	 * 
	 *  @param x double
	 *  @param y double
	 *  @return x - y
	 */
	
	
	/**
	 * multiply
	 * double 타입 숫자 x와 y를 전달 받아서, x * y를 반환하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x * y
	 */
	
	
	/**
	 * divide
	 * double 타입 숫자 x와 y를 전달 받아서, x / y를 반환하는 메서드.
	 * 
	 * @param x double
	 * @param y double
	 * @return x / y
	 */
	
}  // end class
