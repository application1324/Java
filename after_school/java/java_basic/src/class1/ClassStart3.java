package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		// 메모리에 학생 클래스 생성하여 stu1에 담아둠.
		/*
		 클래스을 복제을 하여 사용하는 이유는 
		 내가 필요한 데이터을 변경하게 하지 못하기 위해서이다.
		*/
		Student stu1  = new Student();
//		stu1는 주소값을 가지고 있다.
//		주소값에서 값을 가져오는데 사용한다.
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		System.out.println();
		
		Student stu2  = new Student();
//		stu1는 주소값을 가지고 있다.
//		주소값에서 값을 가져오는데 사용한다.
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
//		java heap영역서 인스턴스을 하면, 
//		인스턴스 변수() -> 인스턴스 값(주소 필드값을 가짐)
		
		/*
		 * 타입은 데이터의 종류나 형태를 나타냄 
		 * int는 정수 타입, String 문자열 타입 
		 * 학생(Student)라는 타입을 만들면 좋지 않을까?
		 * 클래스를 사용하면 int, String과 같은 타입을 
		 * 직접 생할 수 있음 사용자가 직접 정의하고, 
		 * 사용자 정의 타입을 만들려먼 설계도가 필요하고, 
		 * 이 설계도가 클래스임 설계도인 클래스를 사용한다.
		 * 실제 메모리에 만들어진 실체를 
		 * 객체 또는 인스턴스라고 함 클래스를 통해서 사용자가 원하는 
		 * 종류의 데이터 타입을 마음껏 정의할수 있음
		 */
	}
}
