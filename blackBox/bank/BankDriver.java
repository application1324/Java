package bank;

public class BankDriver {
	public static void main(String[] args) {
		
		/*
		 * 인스턴스을 생성하기 위해서는 "생성자"을 사용해야 한다. 
		 * 지금은 생성자는 인스턴스를 생성하는 매소드 정도라고 생각하면 된다. 
		 * 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 써준다.
		 */
		
		Person t1 = new Person();

		t1.name = "홍길동";
		t1.age = 25;
		t1.cashAmount = 30000;
		
		BankAcount a1 = new BankAcount();
		a1.balance = 100000;
				
		Person t2 = new Person();
		
		t2.name = "장발장";
		t2.age = 30;
		t2.cashAmount = 100000;
		
		BankAcount a2 = new BankAcount();
		
		a2.balance = 100000;
		
//		두 객체의 관계 설정
		t1.acount = a1;
		a1.owner = t1;
		
		t2.acount = a2;
		a2.owner = t2;
		
		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
		a1.transfer(t2, 10000);
		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
		
//		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
//		t1.acount.transfer(t2, 50000);
//		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
		
//		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
//		t1.acount.transfer(a2, 50000);
//		System.out.println("t1의 통장잔액 :" + t1.acount.balance);
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
		
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
//		t2.acount.deposit(50000);
//		System.out.println("t2의 통장잔액 :" + t2.acount.balance);
		
//		System.out.println("t2의 현금잔액 :" + t2.cashAmount);
//		t2.acount.withdraw(50000);
//		System.out.println("t2의 현금잔액 :" + t2.cashAmount);
	}
}
