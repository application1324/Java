package oop.hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(solution(arr, target));
    }

    public static boolean solution(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr) {
            int num = target - i;
            // 넣을 값에서 num있는지 확인
            if(set.contains(num)) {
                return true;
            }
            // 값 넣기
            set.add(i);
        }
        return false;
    }
}
