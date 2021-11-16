package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {
    public int solution(String n) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='(') stack.push('(');
            else if(n.charAt(i)==')'){
                stack.pop();
                if(n.charAt(i-1)=='(') {
                    answer += stack.size();
                }else if(n.charAt(i-1)==')'){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        IronStick sol = new IronStick();
        Scanner kb = new Scanner(System.in);

        String m = kb.nextLine();
        System.out.print(sol.solution(m));

    }
}

