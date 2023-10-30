package exam;

import blackBox.BlackBoxRefurbsih;

public class BlackBoxTest {
    public static void main(String[] args) {
        BlackBoxRefurbsih b1 = new BlackBoxRefurbsih();
        // modelName 이외에는 다른 패키지내에서는 정보은닉이 된다(접근관리자을 통해서)
        b1.modelName = "하양이";

    }
}
