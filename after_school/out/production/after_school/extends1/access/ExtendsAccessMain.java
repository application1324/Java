package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();

        // Parent 내부에서 출력하는 것이기 때문에 출력가능
        child.call();
    }
}
