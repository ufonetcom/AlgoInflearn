package dFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
//DFS는 스택과 재귀함수로 풀이 가능. BFS는 큐 자료구조를 이용하여 while 루프를 사용하여 해결.
//미로탐색의 도착지의 대한 최단거리 문제는 BFS로 풀이.
class Point{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class MiroSearchByBFS {
    static int[] dx={-1, 0, 1, 0}; //상하좌우 방향 컨트롤은 이차원 배열로도 할당 가능.
    static int[] dy={0, 1, 0, -1}; //12시부터 시계방향. 상 우 하 좌.
    static int[][] board, dis;
    public void BFS(int x, int y) {
        Queue<Point> Q=new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y]=1;
        while (!Q.isEmpty()){
            Point tmp=Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args){
        MiroSearchByBFS sol = new MiroSearchByBFS();
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        dis=new int[8][8]; //거리 측정 배열
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        sol.BFS(1, 1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}

