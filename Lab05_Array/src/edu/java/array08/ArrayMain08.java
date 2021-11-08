package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		Random rand = new Random();  // 난수를 이용해서 점수를 만들기 위해서.
		
		// 0 ~ 10 사이의 난수 5개를 저장할 수 있는 배열 선언.
		int[] scores = new int[5];
		
		// 배열에 난수 5개를 저장.
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rand.nextInt(11);
		}
		
		// 배열에 저장된 모든 점수를 한 줄에 출력.
		System.out.print("scores: ");
		for (int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 총점을 계산하고 출력: sum = 0 + scores[0] + scores[1] + scores[2] + ...
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		System.out.println("총점: " + sum);
		
		// 평균을 계산하고 출력: (double)sum / length
		double mean = (double)sum / scores.length;
		System.out.println("평균: " + mean);
		
		// 표준편차를 계산하고 출력: Math.sqrt() 메서드를 이용 -> 제곱근(squared root)
		// 표준편차(standard deviation) = sqrt(분산)
		// 분산(deviation) = ((x_0 - mean)^2 + (x_1 - mean) ^2 + ...) / N = 데이터들이 평균에서 떨어져 있는 정도.
		double sumOfSquares = 0.0;
		for (int s : scores) {
			sumOfSquares += (s - mean) * (s - mean);
		}
		double deviation = sumOfSquares / scores.length;
		double stdDev = Math.sqrt(deviation);
		System.out.println("표준편차: " + stdDev);
		
		// 최댓값을 찾아서 출력
		// 최솟값을 찾아서 출력

	}

}
