package dFSAndBFS;

import java.util.Scanner;

//합이같은 부분집합 구하기(DFS) --> DFS는 재귀형식으로 풀되, Length변수를 적극 활용한다. 또한 if, else를 적극 활용한다.
//부분집합 문제는 트리를 이용하여 사용한다 안한다로 구분하면서 풀이를 해나간다.
public class ApartSetSameSumByDFS {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){
                answer="YES";
                flag=true;
            }
        }else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args){
        ApartSetSameSumByDFS sol = new ApartSetSameSumByDFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
            total+=arr[i]; //문제를 풀기위해 배열의 총합을 구해준다.
        }
        sol.DFS(0,0,arr);
        System.out.println(answer);
    }
}

