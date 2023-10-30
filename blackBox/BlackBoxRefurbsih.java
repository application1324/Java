package blackBox;

public class BlackBoxRefurbsih {

    // 클래스는 대문자, 매서드는 소문자 시작

    // 클래스의 구성요소 필드, 매소드, 생성자

    // 생성자가 없는 경우에는 자바가 기본 생성자를 자동으로 생성 및 호출해 준다.
    // 생성자을 만들었을때는 기본 생성자을 만들지 않음


    // 생성자 오버로딩
    public BlackBoxRefurbsih() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 번호을 입력받았습니다 "+serialNumber);
    }
    BlackBoxRefurbsih(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출, 먼저 실행이 됨
        // 사용자 지정 생성자가 실행되기 전에 기본생성자가 실행이됨
//        값이 초기화되려하면 생성자가 먼저 실행이 됨
//        ① 값이 초기화되려하면 생성자 실행
//        ② 생성자 실행됨, 값 초기화됨
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
        System.out.println("사용자 정의 생성자 호출");
    }
    BlackBoxRefurbsih(String modelName, String resolution, int price) {
        this();
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
    }
//    실행될때 어떠한 행동을 무조건해야할때, 값을 초기화할때

    // 인스턴스가 되어야지 사용가능, 공간이 주어지지 않음
    // 필드
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 제품색상
    int serialNumber;

    //    modelName
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }
    //    price
    int getPrice() {
        return price;
    }
    void setPrice(int price){
        if (price < 100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
    }
    //    color
    String getColor(){
        return color;
    }
    void  setColor(String color){
        this.color = color;
    }
    //    resolution
    String getResolution(){
        if (resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        } else {
            return resolution;
        }
    }
    //    .isEmpty() 값이 비어있는가?
//    비어있음 true, 아님 false
    void setResolution(String resolution){
        this.resolution = resolution;
    }


    //    static을 앞에 사용한다면 class변수가 됨, 미리 공간이 주어짐
    //    여러 인스턴스에 같은 값을 넣어야 할때 사용함
    //    클래스 변수
    static boolean canAutoReport = false; //자동신고기능
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음에는 0이였다가 ++연산자를 통해서 값을 증가)

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


    public void appendModelName(String modelName) {
        this.modelName += modelName;
        // this 클래스 안에 있는 인스턴스 변수을 가르킬 수 있음
        // 인스턴스와 파라미터을 나눔, this
    }
}
