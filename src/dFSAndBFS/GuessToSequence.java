package dFSAndBFS;

import java.util.Scanner;

//수열 추측하기(컴비네이션 조합수 사용하기)
//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
public class GuessToSequence {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) { //컴비네이션 함수 알아두기.
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
    }

    public void DFS(int L, int sum) {
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x:p) System.out.print(x+" ");
                flag=true;
            }
        }else {
            for(int i=1; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    p[L]=i;
                    DFS(L+1, sum+(p[L]*b[L]));
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        GuessToSequence sol = new GuessToSequence();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        f=kb.nextInt();
        b=new int[n];
        p=new int[n];
        ch=new int[n+1];
        for(int i=0; i<n; i++){
            b[i]=sol.combi(n-1,i);
        }
        sol.DFS(0,0);
    }
}

