package exam;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] arr) {
        if(arr.length < 2) {
            return 0;
        } else {
            int max = arr[0];
            int min = arr[0];
            for (int i=0; i<arr.length; i++){
                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }
            return max - min;
        }
    }
}
