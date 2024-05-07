package extends1.ex3;

public class ElectricCar extends Car {
    /*
    * 상속받은 매서드을 상속받아 내가 매서드을 만들어 않아도 사용할수있다.
    */

    public void charge() {
        System.out.println("전기을 충전한다.");
    }
}
