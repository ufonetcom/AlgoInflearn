package twoPointersSlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveNumberSubSequence {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, lt = 0;
        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0){
                //0을 1로 바꾸고 cnt를 1증가(0을1로바꿧을때 증가변수)
                cnt++;
            }
            //0을 1로 바꾼 횟수 cnt가 k를 넘어간다면
            while (cnt>k){
                //lt는 rt방향으로 따라가면서 0을 만나면 하나 지워주고 다시 rt움직이기.
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args){
        MaxConsecutiveNumberSubSequence sol = new MaxConsecutiveNumberSubSequence();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(sol.solution(n, m, arr));
    }
}

