package extends1.ex2;

import extends1.ex1.GasCar;

public class CarMain {

    /*
    부모 클래스(슈퍼 클래스) : 상속을 통해 자신의 필드와 메서드을 다른 클래스에게 제공하는 클래스
    자식 클래스(서브 클래스) : 부모 클래스로 부터 필드와 메서등르 상속받는 클래스

    자바는 다중 상속을 지원하지 않는다. 그래서 extends은 대상이 하나만 선택할 수 있다.(단일 상속)

    다중 상속의 단점
    자바는 똑같은 이름을 가진 메서드, 필드을 가지고 있는 클래스가 존재한다면, java는 어느 클래스의 것인지을 모른다.
    그러하기 때문에 다종 상속이 되지 않는다.

    인터페이스을 이용한 다중상속
    인터페이스의 다중 구현을 사용한다면, 다중 상속과 같은 효과을 낼수있다.
    */

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
