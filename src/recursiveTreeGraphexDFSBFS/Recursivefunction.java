package recursiveTreeGraphexDFSBFS;

import java.util.Scanner;

public class Recursivefunction {
    public void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Recursivefunction sol = new Recursivefunction();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        sol.DFS(n);

    }
}

