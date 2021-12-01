package edu.java.file12;

public class FileMain12 {

	public static void main(String[] args) {
		// 파일, 디렉토리(폴더) 관리 - 정보, 생성, 삭제, ...

		// System.getProperty(string): Java Runtime이 실행 중인 컴퓨터의 여러가지 (시스템) 정보들을 리턴.
		// user.dir: 현재 작업 디렉토리(폴더). CWD(Current Working Directory).
		String cwd = System.getProperty("user.dir");
		System.out.println(cwd);
		
		// user.home: OS에 로그인한 사용자(User)의 기본(홈) 디렉토리(폴더).
		String home = System.getProperty("user.home");
		System.out.println(home);
		
		// File 클래스: 파일(txt, jpg, mp4, ppt, java, ...)과 디렉토리(폴더)를 관리할 수 있는 클래스.
		

	}

}
