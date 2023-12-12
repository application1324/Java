package bank;

public class BankAcount {

	//필드
	int balance; //계좌
	//참조형
	Person owner; //소유인
	
	/*
	 * 입금
	 * 파라미터 : 입금할 금액(정수)
	 * 리턴 : 성공여부(boolean)
	 */
	
	boolean deposit(int amount) {
		
		if(amount < 0 || owner.cashAmount < amount) {
			System.out.println("입금 실패입니다. 잔고는 : " + balance + "원, 현금 : " + owner.cashAmount);
			return false;
		}
		
		balance += amount;
		owner.cashAmount -= amount;
		
		System.out.println(amount + "원 입금하였습니다. 잔고는 : " + balance + "원, 현금 : " + owner.cashAmount);
		return true;
	}
	
	/*
	 * 출금 - withdraw
	 * 파라미터 : 출금할 금액(정수) 
	 * 리턴 : 성공여부(boolean)
	 */
	
	boolean withdraw(int amount) {
		if(amount < 0 || balance < amount) {
			System.out.println("출금 실패입니다. 잔고는 : " + balance + "원, 현금 : " + owner.cashAmount);
			return false;
		}
		
		balance -= amount;
		owner.cashAmount += amount;
		
		System.out.println(amount + "원 출금하였습니다. 잔고는 : " + balance + "원, 현금 : " + owner.cashAmount);
		return true;
	}
	
	/*
	 * 이체 - transfer
	 * 첫 번째 파라미터 - 받는 사람(Person)  
	 * 두 번째 파라미터 - 이체 금액(정수) 리턴 :
	 * 성공여부(boolean)
	 */
	
	boolean transfer(Person to, int amount) {
		if(amount < 0 || balance < amount) {
			System.out.println("false - from: " + owner.name + ", to: " + to.name);
			return false;
		}
		
		balance -= amount;
		to.acount.balance += amount;
		
		System.out.println("true - from: " + owner.name + ", to: " + to.name + ", transfer:" + amount);
		return true;
	}
	
	boolean transfer(BankAcount to, int amount) {
		return transfer(to.owner, amount);
	}
	
//	이름이 같아도 오류가 생기지 않는것은 오버로딩 때문이다.
}
