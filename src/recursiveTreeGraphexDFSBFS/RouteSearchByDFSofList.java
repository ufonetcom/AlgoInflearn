package recursiveTreeGraphexDFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

//그래프에서의 경로는 한번 방문한 노드는 지나치면 안된다.
//경로탐색 행렬과는 다르게 인접 리스트는 노드(정점)의 갯수가 많을때 쓰인다.
public class RouteSearchByDFSofList {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch; //방문 체크배열.
    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0; //지나친 배열은 백트리킹 후 다시 0으로 초기화.
                }
            }
        }
    }

    public static void main(String[] args){
        RouteSearchByDFSofList sol = new RouteSearchByDFSofList();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1; //출발점 체크
        sol.DFS(1);
        System.out.println(answer);
    }
}

