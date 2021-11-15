package edu.java.contact.ver01;

import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain01 {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Contact[] contacts = new Contact[5];
	private static int count = 0;  // 배열에 현재까지 저장된 연락처 개수

	public static void main(String[] args) {
		Contact c = new Contact();
		System.out.println(c);

	}

}
