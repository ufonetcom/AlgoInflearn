package sortingandSearching;

import java.util.Scanner;

public class LeastRecentlyUsed {
    public int[] solution(int s, int n, int[] arr) { //s: cache의 크기 5, n: 작업의 갯수 9

        for(int i=0; i<n; i++){
            int tmp = arr[i];
            for(int j=0; j<s; j++){

            }
        }


        return arr;
    }

    public static void main(String[] args){
        LeastRecentlyUsed sol = new LeastRecentlyUsed();
        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int i : sol.solution(s,n,arr)) System.out.print(i + " ");

    }
}

