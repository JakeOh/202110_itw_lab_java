package edu.java.file08;

import java.io.FileOutputStream;

public class FileMain08 {
	private static final String FILE_NAME = "student_list.dat";

	public static void main(String[] args) {
		// 1: ArrayList<Student>를 생성
		// ArrayList에 Student 객체 5개를 추가
		// ArrayList를 파일에 write (Serialize)
		// ObjectOutputStream ==> BufferedOutputStream ==> FileOutputStream ==> 파일
		try (FileOutputStream out = new FileOutputStream(FILE_NAME);) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO 2: 1번에서 저장된 파일에서 객체를 read
		// 객체를 ArrayList로 타입 변환
		// ArrayList에 저장된 원소들을 모두 출력
		
	}

}
