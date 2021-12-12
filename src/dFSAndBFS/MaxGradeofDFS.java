package dFSAndBFS;

import java.util.Scanner;

//제한시간 안에 얻을수 있는 최대점수 출력하기
public class MaxGradeofDFS {
    static int answer = Integer.MIN_VALUE, n, m;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time>m) return;
        if(L==n){ //부분집합 완성 조건 시키기.
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, ps[L]+sum, pt[L]+time, ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }

    }

    public static void main(String[] args){
        MaxGradeofDFS sol = new MaxGradeofDFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //문제 갯수
        m = kb.nextInt(); //제한 시간
        int a[] = new int[n]; //해당문제 점수
        int b[] = new int[n]; //해당문제 시간
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        sol.DFS(0,0, 0, a, b);
        System.out.println(answer);
    }
}

