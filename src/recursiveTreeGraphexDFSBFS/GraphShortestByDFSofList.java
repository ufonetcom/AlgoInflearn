package recursiveTreeGraphexDFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리 구하기(BFS), dis 배열 사용(레벨식풀이 x, 거리(레벨을) 배열에 담기)
public class GraphShortestByDFSofList {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis; //방문 체크배열.

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v]=1;
        dis[v]=0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int currentV = queue.poll(); //현재지점 하나 꺼내기
            for(int nv : graph.get(currentV)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[currentV]+1;
                }
            }
        }

    }

    public static void main(String[] args){
        GraphShortestByDFSofList sol = new GraphShortestByDFSofList();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); //정점갯수
        int m=kb.nextInt(); //간선갯수
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        sol.BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}

