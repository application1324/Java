package exam;

public class Ex01 {
    public static void main(String[] args) {
        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

//        test1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1));
    }
}
