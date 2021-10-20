package string;

import java.util.Locale;
import java.util.Scanner;

public class One {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase(Locale.ROOT);
        t = Character.toUpperCase(t);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        for (char x : str.toCharArray()) {
            if(x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        One one_one = new One();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(one_one.solution(str, c));
        return ;
    }
}

