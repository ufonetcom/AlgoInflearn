package string;

import java.util.Scanner;

public class StringDistanceShortest {

    public String solution(String str, String x) {
        String answer="";
        char[] s = str.toCharArray();
        char ss = x.charAt(0);
        for(char xx : s){
            if(xx == ss){

            }
        }
        return answer;
    }

    public static void main(String[] args){
        StringDistanceShortest ten = new StringDistanceShortest();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        String x = kb.next();
        System.out.println(ten.solution(str, x));

    }
}

