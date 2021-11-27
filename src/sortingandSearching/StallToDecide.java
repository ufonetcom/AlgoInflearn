package sortingandSearching;

import java.util.Arrays;
import java.util.Scanner;

//정렬이 항상 되있어야하며, 이진탐색으로 풀이한다.
public class StallToDecide {
    public int count(int[] arr, int dist){
        int cnt=1, ep=arr[0]; //ep = 이전 말의 배치장소. 배열의 첫번째부터 말을 배치시킨다.
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep >= dist){
                cnt++; //말을 배치한다.
                ep = arr[i]; //말을 배치하고 그 장소를 ednpoint로 결정한다.
            }
        }
        return cnt;
    }

    public int solution(int n,int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)>=m){
                answer=mid;
                lt = mid+1;
            }else rt = mid-1;
        }

        return answer;
    }

    public static void main(String[] args){
        StallToDecide sol = new StallToDecide();
        Scanner kb = new Scanner(System.in);
//        입력 예시
//        5 3
//        1 2 8 4 9
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n,m,arr));

    }
}

