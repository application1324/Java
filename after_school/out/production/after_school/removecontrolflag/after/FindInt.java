package removecontrolflag.after;

public class FindInt {
    public static boolean find(int[] data, int number) {

        // 이름이 분불명한 변수명은 수정해야 한다.
        // boolean flag = false;
        boolean found = false;

        // 이러한 코드는 값을 찾은 다음에도 값을 찾아 비효율적이다.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == number) {
                found = true;

                // break 할수있지만, return하는 것이 좋다.
                return found;
            }
        }
        return false;
    }
}
