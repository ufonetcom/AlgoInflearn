package twoPointersSlidingWindow;

import java.util.Scanner;

public class SumOfConsecutiveNum {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == n) answer++;
            while (sum>=n){
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
            if(lt == n-(n/2)) break;

        }

        return answer;
    }

    public static void main(String[] args){
        SumOfConsecutiveNum sol = new SumOfConsecutiveNum();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(sol.solution(n));
    }
}

