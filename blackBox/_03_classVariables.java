package blackBox;

public class _03_classVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        // 생성자을 통해 클래스을 복사함
        b1.modelName = "까망이";
//        b1.canAutoReport = true;

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
//        b2.canAutoReport = true;

//        특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(b1.modelName + "자동 신고 기능" + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능" + b1.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        BlackBox.canAutoReport = true;

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + "자동 신고 기능" + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능" + b1.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // b1.canAutoReport 보다 BlackBox.canAutoReport 로 사용하는 것을 권장함
        // 클래스 변수 => 클래스이름으로 사용하는 것이 좋음
    }
}
