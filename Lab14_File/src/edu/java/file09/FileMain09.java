package edu.java.file09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * I/O Stream: 바이트 스트림(byte stream) - 입력/출력의 기본 단위가 byte 단위. 모든 파일 형식(txt, mp4, ...)에서 사용 가능.
 * InputStream, OutputStream
 * |__ FileInputStream, FileOutputStream
 * 
 * Reader/Writer: 문자 스트림(character stream) - 입력/출력의 기본 단위가 '인코딩되어 있는 문자' 단위. 텍스트 파일(txt) 파일에서 사용.
 * Reader
 * |__ InputStreamReader: 인코딩 타입을 지정할 수 있는 Reader 클래스
 *     |__ FileReader: 기본 인코딩 값이 운영체제의 인코딩 방식을 따르는 Reader 클래스
 * Writer
 * |__ OutputStreamWriter: 인코딩 타입을 지정할 수 있는 Writer 클래스
 *     |__ FileWriter: 기본 인코딩 값이 운영체제의 인코딩 방식을 따르는 Writer 클래스
 * 
 * 운영 체제(OS: Operating System)의 인코딩 방식
 * - 한글 MS-Windows: EUC-KR(MS949, CP949)
 * - MacOS, Linux: UTF-8
 * 
 * 보조 스트림: I/O Stream과 연결하는 스트림
 *   BufferedInputStream, BufferedOutputStream, ObjectInputStream, ObjectOutputStream
 * 보조 Reader/Writer: Reader/Writer 객체와 연결하는 스트림
 *   BufferedReader, BufferedWriter
 * 
 */

public class FileMain09 {

	private static final String ANSI_FILE = "data/ansi.txt";
	private static final String UTF8_FILE = "data/utf8.txt";
	
	public static void main(String[] args) {
		// 한글 MS-Windows 환경에서 ANSI 방식으로 저장된 텍스트 파일을 FileReader로 읽는 경우
		FileReader reader = null;
		try {
			reader = new FileReader(ANSI_FILE);
			while (true) {
				int character = reader.read();
				if (character == -1) { // 파일끝(EOF)
					break;
				}
				System.out.println(character + " : " + (char)character);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-----");
		// 한글 MS-Windows에서 UTF-8로 작성된 텍스트 파일을 읽는 경우
		try (FileReader reader2 = new FileReader(UTF8_FILE);) {
			while (true) {
				int r = reader2.read();
				if (r == -1) {
					break;
				}
				System.out.println(r + " : " + (char)r);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 위의 두 가지 결과 비교: 실행 환경에 따라서 같은 내용의 파일이 다르게 읽힘.
		
	} // end main()
	
} // end class
