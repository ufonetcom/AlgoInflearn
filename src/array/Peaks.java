package array;

import java.util.Scanner;

public class Peaks {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    //배열의 0을 채워서 풀수도 있지만 자원낭비기 때문에 채우지 않고 풀이
    public int solution(int n, int[][] arr) {
        int answer = 0;
        boolean flag;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flag=true;
                if(i>0 && arr[i][j]<=arr[i-1][j]) flag=false; //i가 맨 윗줄에 있을때 그보다 한칸 위 서치 제외
                if(i<n-1 && arr[i][j]<=arr[i+1][j]) flag=false; //i가 맨 아랫줄에 있을때 그보다 한칸 아래 서치 제외
                if(j>0 && arr[i][j]<=arr[i][j-1]) flag=false; //j가 맨 왼쪽에 있을때 그보다 한칸 왼쪽 서치 제외
                if(j<n-1 && arr[i][j]<=arr[i][j+1]) flag=false; //j가 맨 오른쪽에 있을때 그보다 한칸 오른쪽 서치 제외

                if(flag) answer++;
            }
        }
//        //다른 풀이
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                boolean flag = true;
//                for (int k = 0; k < 4; k++) {
//                    int nx = i + dx[k];
//                    int ny = j + dy[k];
//                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag) answer++;
//            }
//        }

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

