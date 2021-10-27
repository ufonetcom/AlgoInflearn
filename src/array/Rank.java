package array;

import java.util.Scanner;

public class Rank {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1; //해당 i값(탐색할 대상)은 항상 1등으로 맞춰준다.
            for (int j = 0; j < n; j++) {
                if(arr[j]>arr[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args){
        Rank r = new Rank();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        for(int x : r.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}

