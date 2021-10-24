package string;

import java.util.Scanner;

public class StringCompression {

    public String solution(String str) {
        String answer="";
        char[] s = str.toCharArray();
        int tmp = 0;
        char temp = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(temp == s[i]){
                tmp++;
                if(i == str.length()-1){
                    answer += temp + String.valueOf(tmp);
                }
            }else {
                answer += temp;
                if(tmp > 1) answer += String.valueOf(tmp); //문자열을 숫자로.. Integer.toString(), int + ""
                tmp = 1;
                temp = s[i];
            }
        }
        if(tmp == 1) answer += temp;
        return answer;
    }

    public static void main(String[] args){
        StringCompression eleven = new StringCompression();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(eleven.solution(str));

    }
}

