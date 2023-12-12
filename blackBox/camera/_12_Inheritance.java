package blackBox.camera;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 부모로 부터 재산을 물려받아 사직이 사용하는 것
        // 부모 클래스에서 제공하는 모든 것들을 자식 클래스에서 갖다 쓴다(생성자 제외).
        // 자바는 하나의 부모로만 상속 받을 수 있음. 즉, 다중상속이 불가능
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

//        기본 능력
        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

//        고유의 능력
        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicemsePlate();


    }
}
