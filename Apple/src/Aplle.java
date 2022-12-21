import java.util.Scanner;

class Aplle {

	public static void main(String[] args) {
		
		System.out.println("영어시험 개시 정답 개수로 인해 등급이 정해집니다");
		System.out.println("----------------------------------");
		
		String[][] word = {
				{"environment", "환경"},
				{"company", "회사 동반"},
				{"government", "정부"},
				{"face", "얼굴 직면하다"},
				{"race", "경주 인종"},
				{"plant", "식물 경주"},
				{"fire", "불 발사하다 해고하다"},
				{"matter", "문제 물질 중요하다"},
				{"state", "상태 국가 주"},
				{"cause", "원인"},
				{"reason","이유"},
				{"concern", "우려"},
				{"bear", "참다"},
				{"raise", "올리다 기르다"},
				{"subject", "주제 과목 실험대상"},
				{"president", "참석한"},
				{"suggest", "제안하다 암시하다"},
				{"provide", "제공하다"},
				{"allow", "제공하다"},
				{"consider", "숙고하다 고려하다"},
				{"reailze", "깨닫다"},
				{"reduce", "줄이다"},
				{"mean", "의미하다 못된"},
				{"patient","참을성있는"},
				{"ancient", "고대의"},
				{"individual", "개인의"},
				{"positive", "긍정적인"},
				{"various", "다양한"},
				{"likely", "-할것 같은"},
				{"still", "아직도 그럼에도 불구하고"},
				
		};
		
		Scanner scanner = new Scanner (System.in);
		
		
		int 진실 = 0;
		int 거짓 = 0;
		char grate =' ';
		
		for(int i=0;i<word. length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, word[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(word[i][1])) {
				진실 = ++진실;
				System.out.printf("정답입니다.%n%n");
			} else {
				거짓 = ++거짓;
				System.out.printf("틀렸습니다.정답은 %s입니다.%n%n" ,word[i][1]);	
			}
			
				
			if(진실+거짓 >=30){	
			if(진실 >= 30){
				grate = 'A';
			} else if(진실 >= 20){
				grate = 'B';
			} else if(진실 >= 10) {
				grate = 'C';
			} else {
				grate = 'D';
			} System.out.println("자신의등급은"+grate+"입니다");
			 System.out.println("------------------------");
			 System.out.printf("맞춘개수는 %s이고 틀린개수는 %s입니다.%n%n" ,진실,거짓);
			 
			 if(grate >= 'A') {
				 System.out.println("\\ucd95\\ud558\\ud569\\ub2c8\\ub2e4");
			 }
		}
	}
}
	
}
	




