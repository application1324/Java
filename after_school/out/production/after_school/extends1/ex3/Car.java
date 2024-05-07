package extends1.ex3;

public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 상속이 존재하지 않을때는 일일이 모든 클래스에 추가해야하지만, 상속을 한다면, 부모클래스에만 적으면 된다.

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
