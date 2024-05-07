package magicNumber.after;

public class Robot {

    private String name;

    // 상수화는 똑값은 값을 가지고 있다고 하더라도, 문자가 다르기 때문에 괜찮다.
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {


        // 이러한 숫자 데이터을 상수화을 한다면, 더 쉽게 이해할수있고,
        // 기능에 대한 것을 주석을 단다면, 더 쉽게 알수있다.

        if(command == COMMAND_WALK) { // 걷기
            System.out.println(name + " walk");
        }
        else if(command == COMMAND_STOP) { // 멈추기
            System.out.println(name + " STOP");
        }
        else if(command == COMMAND_JUMP) { // 뛰기
            System.out.println(name + " jump");
        }
        else {
            System.out.println(name + " error");
        }

    }
}
