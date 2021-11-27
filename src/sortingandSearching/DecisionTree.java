package sortingandSearching;

import java.util.Arrays;
import java.util.Scanner;

//정렬이 항상 되있어야하며, 이진탐색으로 풀이한다.
public class DecisionTree {
    public int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }else sum+=x;
        }
        return cnt;
    }

    public int solution(int n,int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //stream 기능은 배열에서 내부적으로 iterator를 돌려 원하는 값을 반환해주는 메소드. 여기선 max값 반환.
        //max(), min()은 반환타입이 OptionalInt이기 때문에 getAsInt()메소드를 사용하여 int로 형변환을 시켜준다.
        int rt = Arrays.stream(arr).sum(); //sum()메소드는 타입이 자동 형변환 됨.

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt = mid-1;
            }else lt = mid+1;
        }


        return answer;
    }

    public static void main(String[] args){
        DecisionTree sol = new DecisionTree();
        Scanner kb = new Scanner(System.in);
//        입력 예시
//        9 3
//        1 2 3 4 5 6 7 8 9


        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n,m,arr));

    }
}

