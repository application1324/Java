package magicNumber.after;

import magicNumber.after.Robot;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot("Smith");


        // 이러한 상수을 사용하다면, 실수을 줄일수있다.
        robot.order(Robot.COMMAND_JUMP);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_WALK);

        robot.order(100);

    }
}
