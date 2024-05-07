package extends1.overriding;

public class ElectricCar extends Car {
    /*
    * 상속받은 매서드을 상속받아 내가 매서드을 만들어 않아도 사용할수있다.
    */


    // overriding 상속되는 메서드의 특성을 재정의하는 것을 말한다.
    @Override
    public void move() {
        System.out.println("전기차는 빠르고 조용하게 이동합니다.");
    }
    /*
    1. 메서드의 이름이 같아야 한다.
    2. 메서드 매개변수 타입, 순서, 개수가 같아야한다.
    3. 반환 타입은 같아야 하지만, 하위클래스을 반환해도 된다.
    4. 상위 클래스의 접근 제어자로서 더 제한적인 것을 쓸수없다.
    5. 오버라이딩 메서드는 상위 클래스의 메서드 보다 더 많은 채크 예외을 선언할수없다.
        하지만, 더 적거나, 같은 수의 예외 또는 하위 타입의 예외는 선언할수있다.
    6. static, final, private 메서드는 오러라이딩이 되지 않음

    static : 클래스 레벨에서 작동하기 때문에 의미 없음
    final : 매서드의 재정의을 금한다.
    private : 해당 클래스 내에서 접근한다. 오버라이딩을 할수없음

    7. 생성자는 오러라이딩 할수없다.
    */

    public void charge() {
        System.out.println("전기을 충전한다.");
    }
}
