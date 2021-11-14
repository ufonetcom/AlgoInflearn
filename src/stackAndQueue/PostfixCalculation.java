package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculation {
    public int solution(String n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char i : n.toCharArray()){
            if(Character.isDigit(i)) stack.push(i-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(i=='+') stack.push(rt+lt);
                else if(i=='-') stack.push(rt-lt);
                else if(i=='*') stack.push(rt*lt);
                else if(i=='/') stack.push(rt/lt);
            }
        }
        answer=stack.get(0);

        return answer;
    }

    public static void main(String[] args){
        PostfixCalculation sol = new PostfixCalculation();
        Scanner kb = new Scanner(System.in);

        String m = kb.nextLine();
        System.out.print(sol.solution(m));

    }
}

