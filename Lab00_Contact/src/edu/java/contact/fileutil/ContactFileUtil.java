package edu.java.contact.fileutil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactFileUtil {
	// 상수(constant variable) 정의 - 데이터 폴더 이름, 데이터 파일 이름
	public static final String DATA_DIR = "data"; // 데이터 폴더 이름
	public static final String DATA_FILE = "contacts.dat"; // 데이터 파일 이름
	
	// 생성자를 private으로 선언하고 모든 메서드를 static으로 만듦.
	private ContactFileUtil() {}
	
	/**
	 * 연락처 데이터 파일을 저장하는 폴더가 없으면 생성하고 File 객체를 리턴.
	 * 
	 * @return 데이터 폴더를 관리하는 File 객체
	 */
	public static File initializeDataDir() {
		// TODO
		return null;
	}

	/**
	 * 파라미터에 전달된 File 객체를 사용해서 데이터 파일에 저장된 연락처 정보를 읽어서, 
	 * 연락처 정보를 List 객체로 리턴.
	 * 
	 * @param file 연락처 데이터가 저장된 파일을 관리하는 File 객체.
	 * @return 파일에서 읽은 데이터. ArrayList<Contact> 타입 객체.
	 */
	public static List<Contact> readDataFromFile(File file) {
		// TODO
		return null;
	}
	
	/**
	 * 파리미터에 전달된 data를 file에 씀(write).
	 * 
	 * @param data 파일에 쓸 데이터. Contact 타입을 저장하는 ArrayList. 
	 * @param file 데이터 파일을 관리하는 File 객체.
	 */
	public static void writeDataToFile(List<Contact> data, File file) {
		// TODO
	}
	
	/**
	 * 연락처 데이터를 저장하고 있는 파일(data\contacts.dat)이 있는 지 없는 지 체크해서,
	 * 데이터 파일이 있으면 파일에서 ArrayList를 읽어서 리턴하고,
	 * 데이터 파일이 없으면 빈(empty) 리스트(ArrayList)를 생성해서 리턴.
	 * 
	 * @return Contact 객체를 저장하는 ArrayList.
	 */
	public static List<Contact> initializeData() {
		List<Contact> list  = null; // 리턴할 리스트
		
		// 데이터 파일(data\contacts.dat)을 관리하는 File 객체를 생성.
		File file = new File(DATA_DIR, DATA_FILE);
		if (file.exists()) { // 데이터 파일이 만들어져 있으면
			System.out.println("데이터 로딩중...");
			list = readDataFromFile(file);
		} else { // 데이터 파일이 없으면
			System.out.println("새 데이터 생성중...");
			list = new ArrayList<Contact>();
		}
		
		return list;
	}
	
}
