package class1;

public class ClassStart4 {
	public static void main(String[] args) {
		Student stu1  = new Student();
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2  = new Student();
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
		
		Student[] students = new Student[2];
		students[0] = stu1;
		students[1] = stu2;
		
		// stu1 -> 필드1 <- Stdent[0]
		// stu2 -> 필드2 <- Stdent[1]
		
		System.out.println(students[0].stuName);
		
//		System.out.println(students[0].stuName); // 배열 접근 시작
//		System.out.println(005[0].stuName);  [0]을 사용하여 배열의 0번째 요소 접근
//		System.out.println(001.stuName);  주소을 사용하여 배열의 이름 요소 접근
//		System.out.println(홍길동);  [0]을 이름 출력
	}
}
