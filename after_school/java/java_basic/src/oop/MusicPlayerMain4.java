package oop;

// 객체지향

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }

    // 이러하게 코드을 만든다면, 클래스 내부에 static을 하여, 메서드을 안 만들어도 된다.
    // 일반적으로 static을 사용하지 않는다.

}
