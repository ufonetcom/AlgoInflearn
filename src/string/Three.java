package string;

import java.util.Scanner;

public class Three {

    public String solution(String str) {
        String answer = "";
        String temp="";
        int count = 0;

        for(char tmp : str.toCharArray()){
            if(answer!=" "){
                temp += tmp;
            }else{
                if(answer.length() > temp.length()){

                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Three three = new Three();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(three.solution(str));

    }
}

