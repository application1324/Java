package magicNumber.before;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("Smith");

        // 이러하게 숫자을 사용한다면, 실수가 생길수있다.
        robot.order(0);
        robot.order(1);
        robot.order(2);

        robot.order(100);

    }
}
