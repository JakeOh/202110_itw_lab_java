package edu.java.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.ojdbc.OracleJdbc.*; // 모든 static 멤버(변수, 메서드) 이름을 import

// JDBC(Java Database Connectivity): 자바 프로그램에서 데이터베이스 연결하고 SQL 실행하기
// 1. Oracle JDBC 라이브러리(ojdbc8.jar)를 프로젝트에 추가
//    1) ojdbc8.jar 다운로드
//    2) 프로젝트 폴더에 lib 폴더를 생성
//    3) 다운로드한 ojdbc8.jar 파일을 lib 폴더로 이동
//    4) jar 파일을 build path에 추가
// 2. Oracle 데이터베이스 시스템에 접속할 수 있는 정보들(사용자 이름, 비밀번호, 호스트, 포트, SID)을 상수로 정의
// 3. Oracle JDBC 라이브러리를 사용할 수 있도록 메모리에 로드
// 4. 데이터베이스 시스템에 접속(connection 맺기)
// 5. Statement 객체 생성 - DB 서버에서 실행할 SQL 문장 작성
// 6. Statement 객체의 메서드를 사용해서 작성한 SQL 문장을 DB 서버로 전송/실행시킴
// 7. DB 서버가 SQL 문장을 처리한 결과를 받아서 보여줌

public class JdbcMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			// 3. Oracle JDBC 라이브러리를 메모리에 로드
			DriverManager.registerDriver(new OracleDriver());
			
			// 4. DB 서버와 연결(connection) 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			
			// 5. 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); // DB connection 해제
				System.out.println("DB 연결 끊기 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
