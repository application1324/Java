package magicNumber.after2;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("Smith");


        // enum에 정의된 값만 사용할수있어 잘못된 정보을 넘길수 없다.
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.JUMP);
        robot.order(Robot.Command.STOP);

//        robot.order(100);

    }
}
