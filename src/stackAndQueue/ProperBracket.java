package stackAndQueue;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class ProperBracket {
    public String solution(String n) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : n.toCharArray()){
            if(stack.isEmpty() && x==')') return "NO";
            if(x=='(') stack.add(x);
            else stack.pop();
        }
        if(stack.size()!=0) return "NO";

        return answer;
    }

    public static void main(String[] args){
        ProperBracket sol = new ProperBracket();
        Scanner kb = new Scanner(System.in);

        String n = kb.nextLine();

        System.out.print(sol.solution(n));

    }
}

