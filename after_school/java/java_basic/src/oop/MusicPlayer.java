package oop;

public class MusicPlayer {

    boolean isON = false;
    int volume = 0;

    public void on() {
        isON = true;
        System.out.println("음악 플레이어 시작합니다.");
    }

    public void off() {
        isON = false;
        System.out.println("음악 플레이어를 종류한다.");
    }

    public void volumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
    }

    public void showStatus() {
        if (isON) {
            System.out.println("음악 플레이어 On, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }

    /*
    캡슐화
    MusicPlayer 를 보면, 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 갭슐에 쌍여있는 것 같다.
    이렇게 속성(필드, 멤버변수)과 기능(메서드)을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을
    캡슐화라고 한다.
    */
}
