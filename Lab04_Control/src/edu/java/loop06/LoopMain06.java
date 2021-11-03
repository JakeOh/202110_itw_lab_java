package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// 반복문에서 break vs continue
		// break: 반복문 블록을 실행 중에 break를 만나면, break가 포함된 가장 가까운 반복문 블록을 종료.
		// continue: 반복문 블록을 실행 중에 continue를 만나면, continue 아래쪽 코드는 모두 무시하고
		// 그 다음 반복 과정을 수행함.
		// break 문은 무한 반복문을 종료하는 목적으로 주로 사용됨.
		
		for (int n = 1; n <= 5; n++) {
			System.out.println(n);
			if (n == 3) {
				break;
			}  // end if
		}  // end for
		
		System.out.println("-----");
		
		for (int n = 1; n <= 5; n++) {
			if (n == 3) {
				continue;
			}  // end if
			System.out.println(n);
		}  // end for

		System.out.println("-----");
		// 무한 반복문을 종료하는 break
		// for (초기화 문장; 반복 조건식; 변경 문장) {...} 구문에서
		// 초기화 문장, 반복 조건식, 변경 문장 등은 필수가 아님. 즉, 생략 가능.
		// 문장들과 식들은 생략 가능하지만, 세미콜로(;)은 생략 불가능.
		// 반복 조건식이 생략되면, 영원히 반복되는 무한 반복문이 됨.
		int end = 1;
		for (;;) {
			System.out.println("안녕하세요...");
			if (end == 5) {  // end의 값이 5가 되면
				break;  // 무한 반복문을 종료.
			}
			end++;  // end의 값을 1 증가시킴
		}
		
	}  // end main

}
