package dFSAndBFS;

import java.util.Scanner;

//중복순열
//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
public class PermutationDuplication {
    static int[] pm;
    static int n,m;
    public void DFS(int L) {
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else {
            for(int i=1; i<=n; i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args){
        PermutationDuplication sol = new PermutationDuplication();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        sol.DFS(0);
    }
}

