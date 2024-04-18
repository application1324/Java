package construct;

public class MemberInto {
    String name;
    int age;
    int grade;

    // 기본 생성자
    void initMember() {}

//    메서드 추가, 매개변수로 클래스을 받아오지 않아도된다.
    void initMember(String name, int age, int garde) {
        this.name = name;
        this.age = age;
        this.grade = garde;
    }

//    파라미터가 필드와 같은 값을 가질때는, 파라미터의 값이 우선순위로 먼저들어간다.
//    name = name 파라미터에 값을 줌

//    파라미터의 이름을 조금씩 바꿔쓰기에는 불편하다.
//    이러한 문제을 해결하기 위해서 this을 통해 값의 주소을 변경한다.
//    this는 필드을 뜻하는것이다.
}
