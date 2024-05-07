package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {

        // 전기차
        ElectricCar electricCar = new ElectricCar();

        // 기능
        electricCar.move(); // 움직이기
        electricCar.charge(); // 전기 채우기

        // 가스차
        GasCar gasCar = new GasCar();

        // 기능
        gasCar.move(); // 움직이기
        gasCar.fillUp(); // 가스 채우기

        /*
        * 차의 구분하여, 새로운 분야
        *
        * 추상화
        * 특징을 추상화 하여,
        * 공통되는 특징만 부모클래스가 가지고 있고, 상속을 받아쓴다.
        */
    }
}
