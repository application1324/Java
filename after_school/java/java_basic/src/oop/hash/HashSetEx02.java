package oop.hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(solution(numbers, N));
    }
    public static HashSet<Integer> solution(int[] arr, int N) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                set.add(arr[i]+arr[j]);
            }
        }

        return set;
    }
}
