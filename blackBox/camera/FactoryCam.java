package blackBox.camera;

public class FactoryCam extends Camera { // 자식 클래스
//    extends 확장하다

//    생성자는 상속받을수 없음
    public FactoryCam(){this.name = "공장 카메라"; }

    public void detectFire(){
        // 화제 감지
        System.out.println("화재를 감지합니다");
    }

    @Override // annotation, 아래의 코드에 오류을 체크하게 만듬
//  이것은 오버라이딩이 인지 아닌지 오류로 체크하기 만드는 annotation임
    public void  shoMainFeature() {
        System.out.println(this.name+"의 주요 기능 : 화재 감지");
    }
}
