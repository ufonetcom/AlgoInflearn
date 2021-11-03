package twoPointersSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public int[] solution(int n, int[] arr, int m, int[] arr2) {
        int sum = n+m;
        int[] answer = new int[sum];

        for (int i = 0; i < sum; i++) {
            if(i<n){
                answer[i] = arr[i];
            }else {
                answer[i] = arr2[i-n];
            }
        }
        Arrays.sort(answer);

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

