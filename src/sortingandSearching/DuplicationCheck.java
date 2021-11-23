package sortingandSearching;

import java.util.Scanner;

public class DuplicationCheck {
    public String solution(int n, int[] arr) {
        String answer = "U";
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return "D";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        DuplicationCheck sol = new DuplicationCheck();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n,arr));

    }
}

