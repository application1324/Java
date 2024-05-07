package magicNumber.after2;

public class Robot {

    private String name;

    // 상수와 비슷한 enum은 넣을수있는 값을 지정한다.
    public enum Command {
        WALK,
        STOP,
        JUMP
    }

    public Robot(String name) {
        this.name = name;
    }

    public void order(Robot.Command command) {


        // 이러한 숫자 데이터을 상수화을 한다면, 더 쉽게 이해할수있고,
        // 기능에 대한 것을 주석을 단다면, 더 쉽게 알수있다.

        if(command == Command.WALK) { // 걷기
            System.out.println(name + " walk");
        }
        else if(command == Command.STOP) { // 멈추기
            System.out.println(name + " STOP");
        }
        else if(command == Command.JUMP) { // 뛰기
            System.out.println(name + " jump");
        }
        else {
            System.out.println(name + " error");
        }

    }
}
