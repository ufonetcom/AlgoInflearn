package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public String solution(String a, String b) {
        //다른풀이
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (char x : b.toCharArray()) {
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
//        나의풀이
//        String answer="";
//        HashMap<Character, Integer> amap = new HashMap<>();
//        HashMap<Character, Integer> bmap = new HashMap<>();
//        for(char x: a.toCharArray()){
//            amap.put(x,amap.getOrDefault(x,0)+1);
//        }
//        for(char x: b.toCharArray()){
//            bmap.put(x, bmap.getOrDefault(x,0)+1);
//        }
//        for(char x: amap.keySet()){
//            if(amap.get(x)==bmap.get(x)) answer = "YES";
//            else return "NO";
//        }
        return answer;
    }

    public static void main(String[] args){
        Anagram sol = new Anagram();
        Scanner kb = new Scanner(System.in);

        String a = kb.nextLine();
        String b = kb.nextLine();
        System.out.println(sol.solution(a,b));

    }
}

