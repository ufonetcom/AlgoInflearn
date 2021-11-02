package array;

import java.util.Scanner;

public class DecideToTemporaryCaptain {

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        //i는 학생 번호
        for (int i = 1; i <= n; i++) {
            int stuNum = 0;
            //j는 비교 학생 번호
            for (int j = 1; j <= n; j++) {
                //k는 학년
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]){
                        stuNum++;
                        break;
                    }
                }
            }
            if(stuNum>max){
                max=stuNum;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        DecideToTemporaryCaptain sol = new DecideToTemporaryCaptain();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(sol.solution(n, arr));
    }
}

