package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradeCalculate {
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                cnt++;
                answer += cnt;
            }else cnt = 0;
        }


//        int[] tmp = new int[n];
//        tmp[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            if(arr[i] == 0){
//                tmp[i] = 0;
//            }else {
//                if(arr[i-1] == 0){
//                    tmp[i] = 1;
//                }else {
//                    tmp[i] = tmp[i-1] + 1;
//                }
//            }
//        }
//        for(int x : tmp){
//            answer += x;
//        }

        return answer;
    }

    public static void main(String[] args){
        GradeCalculate gc = new GradeCalculate();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println(gc.solution(n, arr));
    }
}

