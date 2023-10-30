package blackBox;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "black";

        b1.price = -50000;
        System.out.println("가격: "+ b1.price +"원");

        // 고객문의
        System.out.println("해상도 : "+ b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-50000);
        b2.setColor("흰색");

        System.out.println("가격 : "+b2.getPrice()+"원");
        System.out.println("해상도 : "+b2.getResolution());

//        아직 직접 접근이 가능함
        b2.price = -50000;
        System.out.println("가격 : "+b2.price+"원");
    }
}