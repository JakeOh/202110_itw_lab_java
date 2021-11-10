package edu.java.class01;

public class ClassMain01 {

	public static void main(String[] args) {
		// BasicTv 클래스 타입의 변수 선언, BasicTv 인스턴스 생성하고 선언한 변수에 할당(저장)
		// 인스턴스(instance): 메모리에 생성된 객체(object)
		BasicTv tv1 = new BasicTv();
		tv1.info();
		// 메모리에 객체가 생성될 때 클래스의 field들은 그 데이터 타입의 기본값으로 초기화됨.
		// 데이터 타입 기본값: boolean(false), int(0), double(0.0), ...
	}

}
