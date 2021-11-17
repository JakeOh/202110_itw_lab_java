package edu.java.inheritance03;

public class InheritanceMain03 {

	public static void main(String[] args) {
		// 메서드 override
		
		// Car 클래스의 인스턴스를 생성
		Car car1 = new Car(50);
		car1.drive();
		
		System.out.println();
		
		// ElectricCar 클래스의 인스턴스를 생성
		ElectricCar car2 = new ElectricCar(50, 100);
		car2.drive();

		// 다형성(polymorphism): 하나의 인스턴스를 여러가지 타입으로 부를 수 있는 것.
		// 인스턴스를 자식 타입으로 생성하고, 그 인스턴스를 가리키는 참조 변수를 
		// 자식 타입으로도, 부모 타입으로도 선언할 수 있는 것.
		// line 15의 의미는 "참조 변수 car2는 ElectricCar 타입이다."
		
		Car car3 = new ElectricCar(0, 0); // "참조 변수 car3는 (실체는 ElectricCar이지만) Car 타입이다."는 의미.
		
	}

}
