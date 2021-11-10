package edu.java.class02;

public class ClassMain02 {

	public static void main(String[] args) {
		// Student 클래스의 인스턴스 생성
		Student stu1 = new Student();  // 생성자 호출
		System.out.println(stu1);  // 참조 변수: 인스턴스 주소 값
		System.out.println(stu1.id);  // id 필드(변수): 0으로 초기화
		System.out.println(stu1.name);  // name 필드: null 초기화

	}  // end main()

}  // end ClassMain02
