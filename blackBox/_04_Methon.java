package blackBox;

public class _04_Methon {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();
//        클래스 변수, 매서드 : 모든 클래스에서 사용하는 변수에 적용을 할수있음
        BlackBox.canAutoReport = true;
        b1.autoReport();

//        인스턴스 변수, 매서드는 자신에게만 적용됨
        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(0);
        System.out.println("모든 영상 파일 수 : " + fileCount + "개");
    }
}
