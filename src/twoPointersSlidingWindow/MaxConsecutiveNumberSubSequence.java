package twoPointersSlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveNumberSubSequence {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int zerot = 0;
        int length = 0;
        for (int i = 0; i < n; i++) {
            int k = m;
            length = i;
            if(arr[i] == 0){
                System.out.println(i+1+"번째 0일때");
                zerot=i;
                while (k>-1){
                    if(arr[zerot]==0) k--;
                    zerot++;
                    if(zerot==n) break;

                    length++;
                }
                System.out.println("length : "+length);
                System.out.println("i : "+i);
                System.out.println("zero : "+zerot);

                length = length-i;
                if(length>answer) answer = length;
                System.out.println("length : "+length);
                System.out.println("answer : "+answer);
                System.out.println();
            }

        }

        return answer;
    }

    public static void main(String[] args){
        MaxConsecutiveNumberSubSequence sol = new MaxConsecutiveNumberSubSequence();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n, m, arr));
    }
}

