package sortingandSearching;

import java.util.Scanner;

public class DecisionTree {
    public int solution(int n,int m, int[] arr) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args){
        DecisionTree sol = new DecisionTree();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n,m,arr));

    }
}

