package sortingandSearching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SelectionSort {
    public int[] solution(int n, int arr[]) {
        int[] answer = new int[n];


        return answer;
    }

    public static void main(String[] args){
        SelectionSort sol = new SelectionSort();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i : arr) {
            arr[i] = kb.nextInt();
        }
        System.out.print(sol.solution(n,arr));

    }
}

