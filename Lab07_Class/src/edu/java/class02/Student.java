package edu.java.class02;

// class: 속성/정보(field) + 기능(method) [+ 생성자(constructor)] => 데이터 타입
// 생성자: 객체를 메모리에 생성하고, 객체가 가지고 있는 필드들을 초기화하는 특별한 종류의 메서드.

public class Student {
	// field: "학생" 객체가 가져야 할 속성/정보
	int id;  // 학번
	String name;  // 이름
	
	// 생성자(constructor)
	// 1) default constructor(기본 생성자): 파라미터가 없는 생성자
	public Student() {
		// 할 일 없음.
	}
	
	// 2) 파라미터를 갖는 생성자
	public Student(int id, String name) {
		// this.field = parameter; 생성자 호출하는 곳에서 파라미터에 전달 값을 필드에 저장(초기화).
		this.id = id;
		this.name = name;
	}
	
} // end class Student
