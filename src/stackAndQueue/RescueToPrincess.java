package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RescueToPrincess {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) queue.offer(i);

        while (!queue.isEmpty()){
            for(int i=1; i<k; i++) queue.offer(queue.poll()); //k가 3이면 두번째까지만 빼서 뒤로 옮기고
            queue.poll(); //세번째값은 그냥 빼버린다.
            if(queue.size()==1) answer = queue.poll(); //큐 안의 값이 하나 남았을때가 답.
        }

        //나의풀이
//        int cnt = 1;
//        while (queue.size()!=1){
//            if(cnt!=k){
//                cnt++;
//                queue.offer(queue.poll());
//            }else {
//                cnt = 1;
//                queue.poll();
//            }
//        }
//        answer = queue.poll();


        return answer;
    }

    public static void main(String[] args){
        RescueToPrincess sol = new RescueToPrincess();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.print(sol.solution(n,k));

    }
}

