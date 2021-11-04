package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSales {
    public int solution(int n, int m, int[] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = m; i < n; i++) {
            sum += arr[i];
            sum -= arr[i-m];
            if(max<sum) max = sum;

        }

        return max;
    }

    public static void main(String[] args){
        MaximumSales sol = new MaximumSales();
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

