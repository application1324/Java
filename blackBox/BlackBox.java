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
//    여러 인스턴스에 같은 값을 넣어야 할때 사용함

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

//    showDateTime : 날짜정보 표시여부
//    showSpeed : 속도정보 표시여부
//    min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화을 시작합니다");
        if(showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다");
        }
        if(showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다");
    }

    void record(){
        record(true,true,5);
    }

//    고객센터 연결, 고객센터의 전화번호는 같기 때문에 class변수을 사용한다.
    static void callServiceCenter(){
        System.out.println("서비스센터(1588-8888)으로 연결합니다");
//        moderName = "분홍이";
        canAutoReport = true;
//        클래스에서는 인스턴스화 되지 않은 변수의 값을 바꿀수없다
//        클래스 변수는 클래스에서 변경이 가능하다
    }
}
