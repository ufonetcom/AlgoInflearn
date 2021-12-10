package recursiveTreeGraphexDFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프에서의 경로는 한번 방문한 노드는 지나치면 안된다.
public class RouteSearchByDFS {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch; //방문 체크배열.
    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){ //v행에서 i열로 갈수있는(이어져있는) 경로가 있다면, 그리고 방문한 노드가 아니라면
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0; //백 트래킹 했을때 해당 경로를 다시 0으로 초기화 해줘야함.
                }
            }
        }

    }

    public static void main(String[] args){
        RouteSearchByDFS sol = new RouteSearchByDFS();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1] = 1; //출발점 체크
        sol.DFS(1);
        System.out.println(answer);
    }
}

