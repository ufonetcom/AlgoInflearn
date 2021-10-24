package string;

import java.util.Scanner;

public class Password {

    public String solution(int num, String s) {
        String answer="";

        for (int i = 0; i < num; i++) {
            String tmp = s.substring(0,7).replace("#","1").replace("*","0");
            int n = Integer.parseInt(tmp,2);
            answer+=(char)num;
            s=s.substring(7); //인덱스 7부터 그 뒤로 전부다 자르기.
        }
//        나의풀이
//        for (int i = 0; i < num; i++) {
//            String temp = s.substring(i*7, (s.length()/num)*(i+1));
//            temp = temp.replace("#","1");
//            temp = temp.replace("*", "0");
//            int ans = Integer.parseInt(temp,2); //String형의 2진수를 10진수로 변환. radix는 n진수
//
//            answer += (char)ans; //char형으로 타입 변환 시켜주면 10진수는 아스키코드의 문자가 된다.
//        }

        return answer;
    }

    public static void main(String[] args){
        Password pass = new Password();
        Scanner kb = new Scanner(System.in);

        String num=kb.nextLine();
        String s = kb.nextLine();
        System.out.println(pass.solution(Integer.parseInt(num), s));

    }
}

