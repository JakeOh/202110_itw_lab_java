package edu.java.lambda02;

@FunctionalInterface
interface MyMath {
	double calc(double x, double y);
}

public class LambdaMain02 {

	public static void main(String[] args) {
		// MyMath 인터페이스를 구현 - (x - y)의 절대값을 리턴
		MyMath abs = new MyMath() {
			@Override
			public double calc(double x, double y) {
				double result = 0;
				if (x > y) {
					result = x - y;
				} else {
					result = y - x;
				}
				
				return result;
			}
		};
		System.out.println(abs.calc(2.0, 1.0));
		System.out.println(abs.calc(1.0, 2.0));

		// 람다 표현식
		MyMath abs2 = (x, y) -> {
			double result = 0;
			
			if (x > y) {
				result = x - y;
			} else {
				result = y - x;
			}
			
			return result;
		};
		System.out.println(abs2.calc(1.0, 2.0));
		
	}

}
