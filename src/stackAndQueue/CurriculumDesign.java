package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char s : need.toCharArray()) queue.offer(s);

        for(char s : plan.toCharArray()){
            if(queue.contains(s)) {
                if(queue.poll() != s) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args){
        CurriculumDesign sol = new CurriculumDesign();
        Scanner kb = new Scanner(System.in);

        String n = kb.nextLine();
        String m = kb.nextLine();
        System.out.print(sol.solution(n,m));

    }
}

