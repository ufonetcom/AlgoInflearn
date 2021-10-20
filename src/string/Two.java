package string;

import java.util.Locale;
import java.util.Scanner;

public class Two {

    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            }else{
//                answer += Character.toLowerCase(x);
//            }
            if (x >= 65 && x <= 90) { //대문자이면, 소문자는 97~122 아스키
                answer += (char)(x+32);
            }else {
                answer += (char)(x-32);
            }

        }
        return answer;
    }

    public static void main(String[] args){
        Two two = new Two();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(two.solution(str));

    }
}

