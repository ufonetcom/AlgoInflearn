package hashMapAndTreeSet;

import java.util.*;

public class Knumber {
    //k장을 뽑아 합의 조합중 k번째로 큰수를 출력.
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());//기본적으로 TreeSet은 중복제거된 값이 오름차순으로
        // 자동정렬. 문제에선 내림차순을 요구하고 있으니 Collections.reverseOrder()함수를 이용하여 미리 정렬.

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int p=0; p<n; p++){
                    treeSet.add(arr[i]+arr[j]+arr[p]);
                }
            }
        }
        int cnt = 0;

        System.out.println(treeSet.first()); //기본차순(오름차순)인 경우에는 최소값이, 내림차순인 경우는 최대값을 반환한다. treeSet.last() 마지막값 출력.
        for(int x : treeSet){
            cnt++;
            if(cnt == k) return x;
        }


        return answer;
    }

    public static void main(String[] args){
        Knumber sol = new Knumber();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println();
        System.out.print(sol.solution(n,k,arr));

    }
}

