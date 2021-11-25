package edu.java.list03;

public class Member {
	// field
	private String memberId;
	private String memberPassword;
	
	// 생성자(constructor) - 기본 생성자, 파라미터 2개인 생성자
	public Member() {}
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	
	// getters(필드가 가지고 있는 값을 리턴) & setters(필드의 값을 변경)
	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return this.memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	// toString override
	@Override
	public String toString() {
		return "Member{memberId:" + this.memberId + ", memberPassword:" + this.memberPassword +"}";
	}
}
