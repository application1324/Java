package extends1.access.parent;

public class Parent {

    public static int publicValue;
    protected static int protectedValue;
    int defaultValue;
    private int privateValue;

    public void printParent() {
        System.out.println("Parent 매서드 내부");
        System.out.println(publicValue);
        System.out.println(privateValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}
