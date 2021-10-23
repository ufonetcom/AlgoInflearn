package string;

import java.util.Scanner;

public class ExtractionOnlyNum {

    public int solution(String str) {
        int answer=0;
        String tmp = "";
        char[] s = str.toCharArray();
        for(char x : s){
            if(48<=x && x<=57){
                tmp += x;
            }
        }
        answer = Integer.parseInt(tmp);

        return answer;
    }

    public static void main(String[] args){
        ExtractionOnlyNum nine = new ExtractionOnlyNum();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(nine.solution(str));

    }
}

