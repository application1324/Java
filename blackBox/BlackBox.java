package blackBox;

public class BlackBox {

    // 클래스의 구성요소 필드, 매소드, 생성자

    // 필드
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 제품색상
//    인스턴스가 되어야지 사용가능, 공간이 주어지지 않음

//    클래스 변수,
    static boolean canAutoReport = false; //자동신고기능
//    static을 앞에 사용한다면 class변수가 됨, 미리 공간이 주어짐

    // 매서드, 인스턴스 매소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("출동이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상(출동감지)
            return 2;
        }
        return 11;
    }
}
