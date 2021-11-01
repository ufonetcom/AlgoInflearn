package array;

import java.util.Scanner;

public class Peaks {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;


        return answer;
    }

    public static void main(String[] args){
        Peaks sol = new Peaks();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(sol.solution(n, arr));
    }
}

