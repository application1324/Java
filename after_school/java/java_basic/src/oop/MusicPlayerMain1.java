package oop;

// 절차지향

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        boolean isON = false;
        int volume = 0;

        // 음약켜기
        isON = true;
        System.out.println("음악 플레이어 시작합니다.");

        // 볼륨증가
        volume++;
        System.out.println("현재 볼륨 : " + volume );

        // 볼륨감소
        volume--;
        System.out.println("현재 볼륨 : " + volume );

        //음악 플레이어 상태
        if(isON) {
            System.out.println("음악 플레이어 On, 볼륨 : "+volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }

        // 음악 플레이어 끄기
        isON = false;
        System.out.println("음악 플레이어를 종류한다.");
    }
}
