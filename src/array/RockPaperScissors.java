package array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if(arr1[i]-arr2[i] == 1 || arr1[i]-arr2[i] == -2){
                answer[i] = "A";
            }else if(arr1[i]-arr2[i] == -1 || arr1[i]-arr2[i] == 2){
                answer[i] = "B";
            }else if(arr1[i]==arr2[i]){
                answer[i] = "D";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        RockPaperScissors rps = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i]=kb.nextInt();
        }
        for(String x : rps.solution(n, arr1, arr2)){
            System.out.println(x);
        }

    }
}

