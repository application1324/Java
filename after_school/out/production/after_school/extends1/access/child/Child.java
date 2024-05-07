package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        
        // 나머지는 안됨
        
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println();
    }
}
