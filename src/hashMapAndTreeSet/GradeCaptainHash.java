package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class GradeCaptainHash {

    public char solution(int n, String str) {
        char answer=' ';
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        for(char x : str.toCharArray()){
            hash.put(x,hash.getOrDefault(x, 0)+1); //getOrDefault(a,b) -> 키값(a)이 존재하면 그키값의 value 를 리턴하며, 존재하지 않으면(b) b를 리턴한다.
        }

        System.out.println(hash.containsKey('A')); //키값중 'A'를 포함 한다면 true반환. 아니면 false반환.
        System.out.println(hash.size()); //key의 종류의 갯수.
        System.out.println(hash.remove('A')); //'A'라는 키를 삭제. size도 1 작아짐. 정상적으로 삭제되면 삭제된 키의 value값을 출력.

        int max = Integer.MIN_VALUE;
        for(char x : hash.keySet()){ //keySet() -> hash라는 map의 모든 Key값을 리턴
//            System.out.println(x + " " + hash.get(x)); //해당 key의 value까지 출력.
            if(hash.get(x)>max) {
                max = hash.get(x);
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        GradeCaptainHash sol = new GradeCaptainHash();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str=kb.next();
        System.out.println(sol.solution(n,str));

    }
}

