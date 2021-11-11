package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveToBracketCharacter {
    public String solution(String n) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : n.toCharArray()){
            if(x==')' && stack.contains('(')){
                while (stack.pop() != '('); //"(" 까지 꺼내고 이 "("값을 반환한다.
            }else if(x!=')') stack.push(x);
        }
        for(char x : stack){
            //stack은 배열을 세워놓은 구조이기 때문에 stack.get(i)의 값을 출력할 수 있다.
            answer = answer+x;
        }

        return answer;
    }

    public static void main(String[] args){
        RemoveToBracketCharacter sol = new RemoveToBracketCharacter();
        Scanner kb = new Scanner(System.in);

        String n = kb.nextLine();

        System.out.print(sol.solution(n));

    }
}

