package sortingandSearching;

import java.util.Scanner;

public class LeastRecentlyUsed {
    public int[] solution(int s, int n, int[] arr) { //s: cache의 크기 5, n: 작업의 갯수 9
        int[] cache = new int[s];
        int top = 0;
        for(int x : arr){
            int pos = -1; //index 번호
            for(int i=0; i<s; i++){ //작업 번호와 캐시 안의 번호를 탐색
                if(arr[i]==x) pos = i; //만약 캐쉬 히트면 같은값을 가진 index번호를 pos에 담는다.
            }
            if(pos == -1){ //탐색한 값중 작업값과 같지 않으면(캐쉬 미스면)
                for(int i=s-1; i>=1; i++){ //cache 배열 뒤에서부터 하나씩 뒤로 밀고 맨앞 cache[0]에 작업값을 넣는다.
                    cache[i] = cache[i-1];
                }
            }else { //만약 캐쉬 히트면 전에 저장한 pos 값을 이용하여 cache배열의 끝부분부터가 아닌 pos 지점부터 뒤로 밀고 맨앞에 작업값을 붙인다.
                for(int i=pos; i>=1; i++){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args){
        LeastRecentlyUsed sol = new LeastRecentlyUsed();
        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int i : sol.solution(s,n,arr)) System.out.print(i + " ");

    }
}

