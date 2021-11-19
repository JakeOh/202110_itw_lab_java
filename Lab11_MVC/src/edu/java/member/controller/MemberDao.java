package edu.java.member.controller;

import edu.java.member.model.Member;

// DAO(Data Access Object): Controller. 프로그램의 기능(비즈니스 로직).
public interface MemberDao {
	
	/**
	 * 신규 회원 가입 기능: 파라미터로 전달받은 Member 타입 객체를 배열에 저장.
	 * 
	 * @param m - Member 타입(memberId, memberPassword).
	 * @return - 배열에 회원 정보 추가가 성공하면 1, 실패하면 0을 리턴.
	 */
	int insert(Member m);

	/**
	 * 전체 회원 목록 검색 기능: 배열에 저장된 회원(Member 타입)들의 정보를 리턴.
	 * 
	 * @return - null이 아닌 값(Member 객체)가 있는 배열을 생성해서 리턴.
	 */
	Member[] select();
	
}
