package blackBox;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 : Java 클래스들을 비슷한 것들끼리 정리해주는 하나의 폴더

        // 서로 다른 패키지에는 변수가 똑같아도 문제없음
        // com.sungil.1학년.11반.web
        // com.sungil.1학년.11반.app
        // com.sungil.1학년.12반

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위내에서 나옴
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // int의 범위내에서 나옴
        System.out.println("랜덤 실수 : "+random.nextDouble()); // 0.0이상 1.0미만 실수값
        System.out.println("랜덤 실수(범위) : "+random.nextDouble(10.0)); // 0.0이상 1.0미만 실수값

        // 5.0이상 10.0미만의 실수을 뽑으려면
        System.out.println(random.nextDouble(0.5,10.0));

        // 로또 번호 뽑기 1~45
        System.out.println(random.nextInt(1,45));

        // 아래가 자주 쓰이는 패키지임
        // Math, Scanner, StringButter, StringBuilder ...
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime
    }
}
