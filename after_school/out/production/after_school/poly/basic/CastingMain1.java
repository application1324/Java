package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // poly.childMethod();

        // 다운캐스팅(부모타입 -> 자식타입)

        // 이러하게 한다면, poly가 Child가 되는것이 아니다.
        Child child = (Child) poly;
        child.childMethod();
        // 탐색을 하는 위치을 자식으로 낮추면서 자식메서드을 사용할 수 있다.
    }
}
