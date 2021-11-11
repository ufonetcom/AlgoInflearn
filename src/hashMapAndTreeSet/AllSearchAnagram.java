package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AllSearchAnagram {

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> bmap = new HashMap<>();
        HashMap<Character, Integer> amap = new HashMap<>();

        int lt = 0;
        //bmap에 a,b,c를 담는다.
        for(char x : b.toCharArray()){
            bmap.put(x,bmap.getOrDefault(x,0)+1);
        }
        //문자열 b의 길이만큼 슬라이딩 윈도우를 하기위하여 b의 -1 길이만큼 amap(a문자열map)에 값을 넣어논다.
        for(int i=0; i<b.length()-1; i++){
            amap.put(a.charAt(i),amap.getOrDefault(a.charAt(i),0)+1);
        }


        for(int rt=b.length()-1; rt<a.length(); rt++){
            amap.put(a.charAt(rt),amap.getOrDefault(a.charAt(rt),0)+1);
            if(amap.equals(bmap)){
                answer++;
            }
            amap.put(a.charAt(lt),amap.get(a.charAt(lt))-1);
            if(amap.get(a.charAt(lt)) == 0) amap.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        AllSearchAnagram sol = new AllSearchAnagram();
        Scanner kb = new Scanner(System.in);

        String a = kb.nextLine();
        String b = kb.nextLine();
        System.out.println(sol.solution(a,b));

    }
}

