package oop;

// 객체지향

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isON = true;
        System.out.println("음악 플레이어 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isON = false;
        System.out.println("음악 플레이어를 종류한다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("현재 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("현재 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        if (data.isON) {
            System.out.println("음악 플레이어 On, 볼륨 : "+data.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }

    /*
        각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화가 되었다. 따라서 다음과 같은 장점이 생긴다.
        1. 중복 제거 : 로직 주옥이 제거되엇다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 돈다.
        2. 변경 영향 범위 : 기능을 수정할 때 하댕 메서드 내부만 변경하면 된다.
        3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 좀 더 쉽게 이해할 수 있다.

        모듈화 - 레고블록을 생각하자!
        레고에서 필요한 블럭을 가져다 꼽아서 사용할 수 있듯이
        여기서는음악 플레이어의 기능이 피룡하면 해당 기능을 메서드 호출만으로 손쉽게 사용할 수 있다.
        에지 음악 플레이어와 괸련된 메서드를 조립해서 프로그램을 작성할 수 있다.

        멤버 변수
            어떠한 기능에 필요한 값
        메서드
            어떠한 기능
    */
}
