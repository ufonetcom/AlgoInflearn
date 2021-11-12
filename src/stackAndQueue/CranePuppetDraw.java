package stackAndQueue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class CranePuppetDraw {
    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        //4, (3, (1, 1), 3), 2,  , 4
        for(int pos : moves){
            for(int j=0; j<n; j++){
                if(arr[j][pos-1]!=0) {
                    int tmp = arr[j][pos-1]; //뽑을 인형을 저장
                    arr[j][pos-1] = 0; //뽑은 인형은 빈공간으로 바꿔주기.
                    if(!basket.isEmpty() && tmp == basket.peek()) {
                        answer+=2;
                        basket.pop();
                    }
                    else basket.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        CranePuppetDraw sol = new CranePuppetDraw();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i]=kb.nextInt();
        }

        System.out.print(sol.solution(n,arr,m,moves));

    }
}

