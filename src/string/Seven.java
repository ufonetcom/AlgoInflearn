package string;

import java.util.Locale;
import java.util.Scanner;

public class Seven {

    public String solution(String str) {
        String answer="YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){
            return "NO";
        }

//        파트 1
//        str = str.toUpperCase(Locale.ROOT);
//        int len = str.length();
//        for (int i = 0; i < len/2; i++) {
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                return "NO";
//            }
//        }

//        나의 문제풀이
//        String s = str.toUpperCase(Locale.ROOT);
//        char[] ss = s.toCharArray();
//        int lt=0, rt=ss.length-1;
//        while (lt < rt) {
//            if(ss[lt] != ss[rt]){
//                answer = "NO";
//                return answer;
//            }
//            lt++;
//            rt--;
//        }
//        answer = "YES";
        return answer;
    }

    public static void main(String[] args){
        Seven seven = new Seven();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(seven.solution(str));

    }
}

