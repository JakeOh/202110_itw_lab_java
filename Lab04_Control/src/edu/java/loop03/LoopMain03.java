package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// for 반복문을 사용해서 0, 2, 4, 6, 8, 10을 한줄씩 출력
		for (int n = 0; n <= 10; n += 2) {
			System.out.println(n);
		}
		
		System.out.println("-----");
		
		for (int n = 0; n <= 5; n++) {
			System.out.println(2 * n);
		}
		
		System.out.println("-----");
		
		for (int n = 0; n <= 10; n++) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		
	}  // end main

}
