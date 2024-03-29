package edu.java.file08;

import java.io.Serializable;

public class Score implements Serializable {
	// field
	private int korean;
	private int english;
	private int math;

	// constructor - 기본 생성자, 파라미터 3개(int, int, int)를 갖는 생성자 - overloading
	public Score() {}
	public Score(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	// getters & setters
	public int getKorean() {
		return this.korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return this.math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// toString 메서드 override
	@Override
	public String toString() {
		return "{korean=" + this.korean + ", english=" + this.english + ", math=" + this.math + "}";
	}
	
}
