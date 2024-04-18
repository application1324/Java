package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

//    사용자가 생성자을 만들지 않는다면, 자바가 자동으로 생성자을 만든다.
//    그치만, 생성자을 하나라도 만드는 순간 기존 생성자는 만들지 않는다.

    MemberConstruct(){}

    // 오버로딩을 사용하여 이러하게 값을 두개만 받을 경우의 생성자을 만들수있다.
    MemberConstruct(String name, int age){
//      this()는 모든 값을 초기화 하고 있는 생성자을 지정한다.
        this(name, age, 50);
    }

//    이러한 코드는 반복이된다.
//    이러한 반복을 줄이기 위해서 아래와 같이 만들수 있다.

    // 생성자
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


//    메서드을 호출해서 값을 초기화 한다면, 실수을 할수가 있다.
//    이러한 문제을 해결하기 위해서 따로 호출하지 않아도, 실행이 되는 메서드을 생성자라고 한다.

//    생성자의 접근제어자가 없다면 class을 따라간다.
}
