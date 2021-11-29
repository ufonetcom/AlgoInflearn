package recursiveTreeGraphexDFSBFS;

import java.util.Scanner;

public class RecursiveBinaryNum {
    public void DFS(int n) {
        //재귀함수 문제풀이는 보통 if와 else로 분기시켜 풀이.
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+" "); //출력부를 재귀함수 밑에 두면 역정렬화 돼서 출력된다.(Stack의 개념)
        }
    }

    public static void main(String[] args){
        RecursiveBinaryNum sol = new RecursiveBinaryNum();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        sol.DFS(n);

    }
}

