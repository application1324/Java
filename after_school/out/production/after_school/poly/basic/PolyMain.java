package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");

        // Parent 객체 생성
        Parent parent =  new Parent();
        parent.parentMethod();
        // 자신의 메서드

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");

        // Parent, Child 객체 생성
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        // 모든 메서드

        // 부모 변수가 자식 인스턴을 참조(다형적 잠초) -> 부모는 자식을 품을 수 있다!!
        // 자식 클래스에서 부모클래스 탐색 가능
        // 부모 클래스에서 자식 클래스 탐색 불가능
        System.out.println("Parent -> Child");

        // Parent, Child 생성 그치만 Parent의 기능만 사용함
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); 자식의 기능을 호출 할 수 없다.

        // Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

    }
}

/*
1. 객체지향 프로그래밍의 대표적인 특성 : 갭슐화, 상속, 다형성...
2. 다향성은 객체지향 프로그래밍의 꽃이라 불린다.
3. 다형성은 이름 그대로 '다양한 형태', '여러 형태'를 뜻한다.
4. 프로그래밍에서 다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 능력을 말한다.
5. 보통 하나이 객체는 하나의 타입으로 고정되어 있는데 다형성은 사용하면 하느이 객체을 다른 타입으로 사용할 수 있다는 뜻이다.

다형성 2가지 핵심 이론
1. 다형적 참조
3. 메서드 오버라이딩
**/
