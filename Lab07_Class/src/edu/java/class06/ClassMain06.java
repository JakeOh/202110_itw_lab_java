package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account1 = new Account(123456, 1000.0);
		account1.info();
		
		Account account2 = new Account(123789, 1000.0);
		account2.info();

	}

}
