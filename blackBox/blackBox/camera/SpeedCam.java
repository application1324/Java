package blackBox.camera;

public class SpeedCam extends Camera{

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed(){
        System.out.println("속도을 측정합니다");
    }

    public void recognizeLicemsePlate(){
        // 번호 인식
        System.out.println("차량번호을 인식합니다");
    }

    @Override // annotation
    public void  shoMainFeature() {
        System.out.println(this.name+"의 주요 기능 : 속도 측정, 번호 인식");
    }
}

