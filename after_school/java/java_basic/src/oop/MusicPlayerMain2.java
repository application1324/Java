package oop;

// 객체지향 변수화

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData Data = new MusicPlayerData();

        // 음약켜기
        Data.isON = true;
        System.out.println("음악 플레이어 시작합니다.");

        // 볼륨증가
        Data.volume++;
        System.out.println("현재 볼륨 : " + Data.volume );

        // 볼륨감소
        Data.volume--;
        System.out.println("현재 볼륨 : " + Data.volume );

        //음악 플레이어 상태
        if(Data.isON) {
            System.out.println("음악 플레이어 On, 볼륨 : "+Data.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }

        // 음악 플레이어 끄기
        Data.isON = false;
        System.out.println("음악 플레이어를 종류한다.");
    }
}
