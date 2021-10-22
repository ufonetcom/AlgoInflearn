package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Four {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

//        for(String inp : str){
//            String tmp = new StringBuilder(inp).reverse().toString();
//            answer.add(tmp);
//        }
        return answer;
    }

    public static void main(String[] args){
        Four four = new Four();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for(String x : four.solution(n, str)){
            System.out.println(x);

        }

    }
}

