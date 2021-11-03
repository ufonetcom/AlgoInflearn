package array;

import java.util.Scanner;

public class Mentoring {

    public int solution(int n,int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { //비교할 첫번째 학생번호
            for (int j = 1; j <= n; j++) {  //비교할 두번재 학생번호  >> 짝을 만들 수 있는 총 경우의수
                int cnt = 0;
                for (int k = 0; k < m; k++) { //테스트의 수
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) { //k번째의 문제에서 i맨토와 j멘티의 인덱스를 찾아 s에 넣는다.
                        if(arr[k][s] == i) pi=s;
                        if(arr[k][s] == j) pj=s;
                    }
                    if(pi<pj) cnt++; //k번째 문제에서 i가 j보다 등수가 앞서면 cnt 1 증가.
                }
                if(cnt == m) answer++; //k문제수를 다 돌고 나서 i의 등수가 j의 등수를 모두 앞선다면 (앞설경우가 문제수와 같다면) i,j의 경우에수 탄생.
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Mentoring sol = new Mentoring();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(sol.solution(n, m, arr));
    }
}

