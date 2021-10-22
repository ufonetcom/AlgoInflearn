package string;

import java.util.Locale;
import java.util.Scanner;

public class Eight {

    public String solution(String str) {
        String answer="NO";

        //여기서 정규식 대신 forEach문을 통하여 str을 Character.isAlphabetic()로 체크한 후 비어있는 String에 알파벳만 담는 방식도 존재.
        str= str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        Eight eight = new Eight();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(eight.solution(str));

    }
}

