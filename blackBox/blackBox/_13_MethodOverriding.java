package blackBox;

import blackBox.camera.Camera;
import blackBox.camera.FactoryCam;
import blackBox.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 매서드 오바라이딩 : 자식 클래스에서 부모 클래스의 매소드를 덮어쓰기(재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam =new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

//        부모의 주요기능과는 겹치지 않음
        camera.shoMainFeature();
        factoryCam.shoMainFeature();
        speedCam.shoMainFeature();
    }
}
