package edu.java.contact.fileutil;

import java.io.File;
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
}
