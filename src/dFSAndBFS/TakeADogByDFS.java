package dFSAndBFS;

import java.util.Scanner;

//바둑이 승차 문제도 부분집합과 같은 장르. -->
public class TakeADogByDFS {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr) {
        if(sum>c) return;
        if(L==n){ //DFS는 부분집합이 완성될때를 if조건으로 둔다.
            answer=Math.max(answer, sum);
        }else {
            DFS(L+1,arr[L]+sum, arr);
            DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args){
        TakeADogByDFS sol = new TakeADogByDFS();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt(); //트럭의 무게
        n = kb.nextInt(); //바둑이 마리수
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        sol.DFS(0,0,arr);
        System.out.println(answer);
    }
}

