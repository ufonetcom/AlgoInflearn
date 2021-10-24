package string;

import java.util.Scanner;

public class StringDistanceShortest {

    public int[] solution(String str, char t) {
        int[] answer=new int[str.length()];
        char[] strc = str.toCharArray();

        int max = 1000; //초기 거리를 넉넉하게 잡기.
        //왼쪽 문자로부터의 거리 계산
        for(int i=0; i<strc.length; i++){
            if(strc[i] == t){
                max = 0;
                answer[i] = max;
            }else {
                max++;
                answer[i] = max;
            }
        }

        max = 1000;
        //오른쪽 문자로부터의 거리 계산
        for(int i=strc.length-1; i>=0; i--){
            if(strc[i] == t){
                max = 0;
            }else {
                max++;
                answer[i] = Math.min(answer[i], max);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        StringDistanceShortest ten = new StringDistanceShortest();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        char c = kb.next().charAt(0);
        for(int x : ten.solution(str, c)){
            System.out.print(x + " ");
        }

    }
}

