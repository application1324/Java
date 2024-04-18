package oop.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        solution(numbers, N);
    }
    public static void solution(int[] arr, int N) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                set.add(arr[i]+arr[j]);
            }
        }

        // Iterator 사용하기
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }

        // 배열 등록하기
        int[] newNums = set.stream().mapToInt(Integer::intValue).toArray();
        for(int num : newNums) {
            System.out.print(num+" ");
        }
    }
}
