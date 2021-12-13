package dFSAndBFS;

import java.util.Scanner;

//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
public class PermutationDuplication {
    static int answer = Integer.MIN_VALUE, n, m;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {


    }

    public static void main(String[] args){
        PermutationDuplication sol = new PermutationDuplication();
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

