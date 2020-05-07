package sub2;

/* 
 * 날짜 : 2020/05/07
 * 이름 : 박수령
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		// 국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
		
		// 입금, 출금, 잔액조회하기
		kb.deposit(10000); // 입금
		kb.withdraw(5000); // 출금
		// kb.money--; // 객체의 멤버변수의 캡슐화를 통한 취약코드 예방
		kb.info(); // 조회
		
		// 신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
		
		// 입금, 출금, 잔액조회하기
		sh.deposit(10000); // 입금
		sh.withdraw(8000); // 출금
		sh.info(); // 조회
		
	}

}
