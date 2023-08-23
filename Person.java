package bank;

// 	class는 설계도
//	객체 지향 언어에서는 재활용이 중요하다.
//	class는 다른 사람이 변경할수 없고 알아서 변경해 쓰는것
//	main 함수가 무조건 있어야 하는것이 아니다.
public class Person {
	
	// 필요한 속성들을 넣는것을 필드라고 한다.
	
	// 필드
	String name; // 이름
	int age; // 나이
	int cashAmount; //돈 보유량
	BankAcount acount;
//	참조형
	
	boolean transfer(Person to, int amount) {
		
		if(amount < 0 || acount.balance < amount) {
			System.out.println("false - from: " + name + ", to: " + to.name);
			return false;
		}
		
		acount.balance -= amount;
		to.acount.balance += amount;
		
		System.out.println("true - from: " + name + ", to: " + to.name + ", transfer:" + amount);
		return true;
	}
	
	boolean transfer(BankAcount to, int amount) {
		return transfer(to.owner, amount);
	}
}
