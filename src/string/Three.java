package string;

import java.util.Scanner;

public class Three {

    public String solution(String str) {
        String answer = "";
        int cnt = Integer.MIN_VALUE;
        int index;
        while((index = str.indexOf(" ")) != -1){
            String tmp = str.substring(0,index);
            int len = tmp.length();
            if(len > cnt){
                cnt = len;
                answer = tmp;
            }
            str = str.substring(index+1);
        }
        if (str.length() > cnt) {
            answer = str;
        }

//        String[] temp= str.split(" ");
//        for(String tmp : temp){
//            int len = tmp.length();
//            if(len > cnt){
//                cnt = len;
//                answer = tmp;
//            }
//        }

        return answer;
    }

    public static void main(String[] args){
        Three three = new Three();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(three.solution(str));

    }
}

