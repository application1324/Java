package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.openDoor();
        gasCar.move();
        gasCar.fillUp();

        /*
        소형차, 중형자, 대형차와 같이 클래스을 나누어서 기능을 따로 만들수있다.
        일 : 다, 다 : 일으로 참조가 가능하다.
        */
    }
}
