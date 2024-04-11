package class1;

public class ClassStart2 {
	public static void main(String[] args) {
		
		// 배열로 저장하기
		String[] names = {"홍길동", "장발장", "임꺽정"};
		int[] ages = {15, 16, 19};
		int[] grades = {90, 80, 99};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름:"+names[i]+
					" 나이:"+ages[i]+"세 성적:"+grades[i]+"점");
		}
		
		// 변수로 저장하기
		// String name = "홍길동";
		// int age = 15;
		// int grade = 90;

		//	String name1 = "장발장";
		// int age1 = 16;
		// int grade1 = 80;
		
		// System.out.println("이름:"+name1+" 나이:"+age1+"세 성적:"+grade1+"점");
	}
}
