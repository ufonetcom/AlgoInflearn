package dFSAndBFS;

import java.util.Scanner;

//조합수(메모이제이션) 컴비네이션 사용.
//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
public class CombinationNumber {
    int[][] dy = new int[35][35];
    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
    }

    public static void main(String[] args){
        CombinationNumber sol = new CombinationNumber();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        System.out.println(sol.DFS(n, r));
    }
}

