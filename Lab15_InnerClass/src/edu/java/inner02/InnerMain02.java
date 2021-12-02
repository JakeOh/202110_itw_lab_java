package edu.java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		// Test 클래스의 인스턴스 생성
		Test t = new Test();
		// TestCounter 클래스의 인스턴스 생성
		TestCounter counter = new TestCounter(t);
		counter.printCount();
		counter.addCount();
		counter.printCount();

	}

}
