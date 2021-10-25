package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDecimal {
    public boolean isPrime(int num) {
        if(num == 1) return false;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //자연수 뒤집기 메소드
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res=0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res*10+t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res); //소수판별 메소드
        }
        return answer;
    }

    public static void main(String[] args){
        ReverseDecimal rdecimal = new ReverseDecimal();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        for(int i : rdecimal.solution(n, arr)){
            System.out.print(i+" ");
        }
    }
}

