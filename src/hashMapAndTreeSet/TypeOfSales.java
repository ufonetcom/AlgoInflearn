package hashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TypeOfSales {
    public ArrayList<Integer> solution(int n, int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt =0;

        //애초에 for 문 하나를 slide for문 전에 돌려서 k가 0~3일때의 초기값을 미리 넣어두고 시작하는 방법이있다. 그리하면 if(rt-lt==m-1)이라는 조건을 걸지 않아도 된다.
        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(rt-lt==(m-1)){
                answer.add(map.size());
                map.put(arr[lt], map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) map.remove(arr[lt]);
                lt++;
            }
        }

//        나의풀이(제한시간 초과 걸림)
//        for (int i = 0; i < n - m + 1; i++) {
//            HashSet<Integer> set = new HashSet<>(); //Set 은 저장순서를 유지하지 않으며 중복을 허용하지 않는다. 저장순서를 유지하려면 LinkedHastSet 사용
//            int cnt = i;
//            while (cnt<m+i){
//                set.add(arr[cnt]);
//                cnt++;
//            }
//            for(int x:set){
//                System.out.print(x + " ");
//            }
//            System.out.println();
//            answer.add(set.size());
//        }

        return answer;
    }

    public static void main(String[] args){
        TypeOfSales sol = new TypeOfSales();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x:sol.solution(n, m, arr)){
            System.out.print(x+" ");
        }
    }
}

