package blackBox.camera;

public class SpeedCam {
    public String name;

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void takePicture(){
        // 사진 찰영
    }

    public void recordVideo(){
        // 동영상 녹화
    }

    public void checkSpeed(){
        System.out.println("속도을 측정합니다");
    }

    public void recognizeLicemsePlate(){
        // 번호 인식
        System.out.println("차량번호을 인식합니다");
    }
}
