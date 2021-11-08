package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// 메서드 작성 연습
		int[] scores = {10, 20, 100, 90, 81};  // 정수 5개를 저장하는 배열
		int total = sum(scores);  // 정수 배열을 sum 메서드의 argument로 전달, 호출
		System.out.println("총점: " + total);
	}  // end main()
	
	/**
	 * 정수들의 배열을 전달 받아서, 배열의 모든 원소들의 합을 반환하는 메서드.
	 * 
	 * @param numbers 정수(int)들의 배열.
	 * @return 배열의 모든 원소들의 합.
	 */
	public static int sum(int[] numbers) {
		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		return total;
	}
	
}  // end class
