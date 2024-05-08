package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0); // 다른 생성자를 호출하기 위해 첫 번째 줄에 위치해야 합니다.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 상위 클래스의 생성자를 호출합니다.
        System.out.println("ClassB의 생성자 a=" + a + " b=" + b);
    }

//    1. 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화하고,
//    그 다음에 자식의 데이터를 초기화한다.
//    2. 상속 관계에서 자식 클래스의 생성자 첫 줄에 반드시 super(...)를 호출해야 한다.
//    단, 기본 생성자 ( super() )인 경우 생략할 수 있다.

}
