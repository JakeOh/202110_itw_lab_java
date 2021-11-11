package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Point 클래스의 인스턴스를 생성
		Point pt1 = new Point();
		pt1.info();  // pt1의 정보를 출력
		pt1.move(2, 3);  // (0, 0) -> (2, 3) 이동
		pt1.info();  // 이동 후 점의 좌표 출력
		
		System.out.println();
		Point pt2 = new Point(4, 3);
		pt2.info();
		Point result = pt2.move(2, 1);  // (1)
		result.info();
		System.out.println(pt2);
		System.out.println(result);  // pt2와 reuslt는 같은 인스턴스를 가리킨다.
		
		// result가 Point 타입이기 때문에 Point 클래스의 메서드를 사용할 수 있다.
		result.move(0, 2);  // (2)
		result.info();
		pt2.info();
		
		// 위의 (1)과 (2)를 나눠서 호출하는 코드를 아래와 같은 메서드 연쇄 호출로 할 수 있다.
		// pt2.move(2, 1).move(0,2);

	}

}
