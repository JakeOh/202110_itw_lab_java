package edu.java.class06;

// 은행 계좌 클래스
// 속성(상태, 데이터): 계좌번호, 잔액
// 기능: 입금(deposit), 출금(withdraw), 이체(transfer), 정보(info)
public class Account {
	// field
	int accountNo;  // 계좌번호
	double balance; // 잔액
	
	// 파라미터가 2개인 생성자
	
	// 메서드
	/**
	 * 입금(depoit) - 잔액 balance를 금액 amount만큼 증가시킴.
	 * 
	 * @param amount - double. 입금할 금액.
	 * @return 입금 후 잔액을 리턴.
	 */

	/**
	 * 출금(withdraw) - 잔액 balance를 금액 amount만큼 감소시킴.
	 * 
	 * @param amount - double. 출금할 금액.
	 * @return 출금 후 잔액을 리턴.
	 */
	
	/**
	 * 이체(transfer) - amount 금액을 to 계좌로 이체.
	 * 
	 * @param amount - double. 이체할 금액.
	 * @param to - Account. 이체할 계좌.
	 * @return true(이체 성공) 리턴.
	 */

}
