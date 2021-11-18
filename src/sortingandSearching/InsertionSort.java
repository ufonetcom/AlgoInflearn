package sortingandSearching;

import java.util.Scanner;

public class InsertionSort {
    public int[] solution(int n, int[] arr) {
        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1] = tmp; //j를 활용하여 j--증감 연산자를 이용했기 때문에 j를 감소시키고 j for문을 빠져나온다.
        }

        return arr;
    }

    public static void main(String[] args){
        InsertionSort sol = new InsertionSort();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int i : sol.solution(n,arr)) System.out.print(i + " ");

    }
}

