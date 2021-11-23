package sortingandSearching;

import java.util.Arrays;
import java.util.Scanner;

//HashMap으로도 풀이 가능
public class DuplicationCheck {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) return "D";
        }


//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j<n; j++){
//                if(arr[i]==arr[j]){
//                    return "D";
//                }
//            }
//        }

//        해당 문제에서는 HashMap으로 푸는것이 시간복잡도상 제일 효율적이다.
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int x : nArr) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//            if (map.get(x) >= 2) {
//                return 'D';
//            }
//        }
//        return 'U';

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

