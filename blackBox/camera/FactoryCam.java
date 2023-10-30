package blackBox.camera;

public class FactoryCam {

    public  String name;

    public FactoryCam(String name) {
        this.name = "공장 카메라";
    }

    public void takePicture(){
        // 사진 찰영
    }

    public void recordVideo(){
        // 동영상 녹화
    }

    public void detectFire(){
        // 화제 감지
        System.out.println("화재를 감지합니다");
    }
}
