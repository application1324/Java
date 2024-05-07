package magicNumber.before;

public class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {

        // 이러하게 어떠한 행동을 하는지을 명확하게 알수없고, 실수을 할수있다.
        if(command == 0) {
            System.out.println(name + " walk");
        } else if(command == 1) {
            System.out.println(name + " STOP");
        } else if(command == 2) {
            System.out.println(name + " jump");
        } else {
            System.out.println(name + " error");
        }

    }
}
