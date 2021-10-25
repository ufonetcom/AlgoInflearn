package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public int[] solution(int n) {
        int[] answer = new int[n];
        int a=1;
        int a1=1;
        int a2=0;
        answer[0] = a;
        answer[1] = a1;
        for(int i=2; i<n; i++){
            a2 = a+a1;
            a = a1;
            a1 = a2;
            answer[i] = a2;
            //answer[i] = answer[i-2]+answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        for(int x : f.solution(n)){
            System.out.print(x+" ");
        }

    }
}

