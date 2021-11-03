package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {

        //다른 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if(arr[p1] < arr2[p2]) answer.add(arr[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1<n) answer.add(arr[p1++]);
        while (p2<m) answer.add(arr2[p2++]);

//        나의풀이
//        int sum = n+m;
//        int[] answer = new int[sum];
//
//        for (int i = 0; i < sum; i++) {
//            if(i<n){
//                answer[i] = arr[i];
//            }else {
//                answer[i] = arr2[i-n];
//            }
//        }
//        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args){
        MergeTwoArray sol = new MergeTwoArray();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        for(int x : sol.solution(n, arr, m, arr2)){
            System.out.print(x + " ");
        }
    }
}

