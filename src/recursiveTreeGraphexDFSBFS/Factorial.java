package recursiveTreeGraphexDFSBFS;

import java.util.Scanner;

public class Factorial {
    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args){
        Factorial sol = new Factorial();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        System.out.println(sol.DFS(n));

    }
}

