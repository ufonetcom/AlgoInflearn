package sortingandSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public int solution(int n,int m, int[] arr) {
        int answer = 0;
        //이진탐색은 항상 배열(리스트)이 정렬이 되어있어야 한다.
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }
            if(arr[mid]>m) rt = mid-1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args){
        BinarySearch sol = new BinarySearch();
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

