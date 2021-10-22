package string;

import java.util.HashSet;
import java.util.Scanner;

public class Six {

    public String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i){ //indexOf(str) str이 처음 발견된 인덱스 반환, i는 현재 실제 인덱스.
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Six five = new Six();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(five.solution(str));

    }
}

