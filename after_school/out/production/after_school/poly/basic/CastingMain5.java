package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // instanceof 연산자는 오론쪽의 객체을 가지는지 판단함
        if(parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            ((Child)parent).childMethod();
        }
    }
}

/*
 지금처럼 다운캐스팅ㅇ르 수행하기 저넹는 머전 instanceof를 사용해서 원하는 타이브로 변경이 가능한지 확인한 다음에 다운캐스팅을
 수행하는 것이 안전하다.
 참고로 instanceof 키워드는 올쪽 대상의 자식 타입을 왼쪼겡 참ㅈ하는 경우에는 ture을 반환한다.

 parent instanceof Parent

 new Parent() instanceof Parent : true
 new Child() instanceof Parent : true

 new Parent() instanceof parent true
 Parent p = new Parent() : ture

 new Child(0 instanceof Parent : true
 Parent p = new Child() : true

 new Parent() instanceof Child
 Child c = new Parent() : false

*/
