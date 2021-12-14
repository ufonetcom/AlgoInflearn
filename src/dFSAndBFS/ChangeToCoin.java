package dFSAndBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//동전교환
//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
//이 문제는 동전의 최소 갯수를 구하는 문제이기때문에 동전의 종류가 작은값이 아닌 큰값으로 정렬해서 연산을하면 수행속도가 훨씬 빨라진다. sort사용.
public class ChangeToCoin {
    static int n,m, answer=Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer[] arr) {
        if(sum>m) return;
        if(L>=answer) return; //동전의 현재 답의 갯수가 5일때 그밖의 6,10,15..의 갯수는 구하지 않아도됌.(동전 갯수의 최솟값을 구하는 문제이기 때문)
        if(sum==m){
            answer=Math.min(answer, L); //동전을 사용하여 거슬러줄 금액이랑 맞다면 동전을 사용한 갯수중 최솟값을 answer에 대입.(동전 사용 케이스가 여러게이기 때문)
        }else {
            for(int i=0; i<n; i++){
                DFS(L+1,sum+arr[i],arr);
            }
        }
    }

    public static void main(String[] args){
        ChangeToCoin sol = new ChangeToCoin();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m=kb.nextInt(); //거슬러줄 금액.
        sol.DFS(0,0,arr);
        System.out.println(answer);
    }
}

