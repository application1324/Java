package blackBox;

public class _10_AccessModifier {
    public static void main(String[] args) {

        // 캡술화 : 필요한 것들끼리만, 서로 연관된 것들끼리만 하나의 캡술에 담는다
        // 정보 은닉 : 정보을 숨기는 것

        // 접근제어자
        // public : 모든 클래스에서 접근가능
        // protected : 같은 패키지 내에서, 다른 패키지만 경우 자식 클래스에서 접근하려면 상속 받아야 가능
        // default : (아무것도 적지않을때)같은 패키지 내에서만 접근 가능
        // private : 해당 클래스 내에서 접근 가능
        BlackBoxRefurbsih b1 = new BlackBoxRefurbsih();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "흰색";
    }
}
