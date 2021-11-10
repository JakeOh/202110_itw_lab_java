package edu.java.class01;

public class ClassMain01 {

	public static void main(String[] args) {
		// 인스턴스(instance): 메모리에 생성된 객체(object)
		// 붕어빵 - 객체(object), 붕어빵 틀 - 클래스(class), 
		// 붕어빵 틀을 사용해서 구워낸 실제 붕어빵 - 인스턴스(instance)
		
		// BasicTv 클래스 타입의 변수 선언, BasicTv 인스턴스 생성하고 선언한 변수에 할당(저장)
		BasicTv tv1 = new BasicTv();
		System.out.println(tv1);
		tv1.info();
		// 메모리에 객체가 생성될 때 클래스의 field들은 그 데이터 타입의 기본값으로 초기화됨.
		// 데이터 타입 기본값: boolean(false), int(0), double(0.0), ...
		// 인스턴스의 field 또는 method를 사용할 때는 "지역변수.필드/메서드" 형식으로 사용.
		// 참조 연산자(.): 지역 변수가 저장하고 있는 메모리 주소를 찾아간다(참조한다)는 의미.
	}

}
