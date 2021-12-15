package dFSAndBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//순열구하기(중복x)
//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
public class Permutation {
    static int n,m;
    public void DFS(int L) {

    }

    public static void main(String[] args){
        Permutation sol = new Permutation();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        sol.DFS(0);
    }
}

