package dFSAndBFS;

import java.util.Scanner;

//조합문제는 외워두는게 좋음.! (순열과 반대로 조합은 순서를 신경쓰지 않는다.)
public class Combination {
    static int[] combi;
    static int n,m;
    public void DFS(int L, int s){
        if(L==m){ //레벨이 m이되면 조합 완성
            for(int x:combi) System.out.print(x+" ");
            System.out.println();
        }else {
            for(int i=s; i<=n; i++){
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args){
        Combination sol = new Combination();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt(); //n개중에
        m=kb.nextInt(); //m개를 뽑는다.
        combi=new int[m];
        sol.DFS(0,1);
    }
}
