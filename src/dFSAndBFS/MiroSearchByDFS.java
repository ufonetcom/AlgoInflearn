package dFSAndBFS;

import java.util.Scanner;

//어떤 경우의 수들을 따질때는 DFS를 사용하시고, 최단거리, 최소거리를 구할 때는 BFS라는 사실을 염두에 두고 알고리즘 공부.
//DFS는 스택과 재귀함수로 풀이 가능. BFS는 큐 자료구조를 이용하여 while 루프를 사용하여 해결.
//미로탐색의 도착지의 모든 경우의수문제는 DFS를 재귀적으로 (백트래킹) 풀이.
public class MiroSearchByDFS {
    static int[] dx={-1, 0, 1, 0}; //상하좌우 방향 컨트롤은 이차원 배열로도 할당 가능.
    static int[] dy={0, 1, 0, -1}; //12시부터 시계방향. 상 우 하 좌.
    static int[][] board;
    static int answer=0;
    public void DFS(int x, int y) {
        if(x==7 && y==7) answer++;
        else {
            for(int i=0; i<4; i++){ //상하좌우 방향 접근. i=0, 12시 상 / i=1, 3시 우 / i=2, 6시 하 / i=3, 9시 좌
                int nx=x+dx[i]; //상하
                int ny=y+dy[i]; //우좌
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    DFS(nx, ny);
                    board[nx][ny]=0; //백트래킹 시 통로를 0으로 풀어줘야함!!!
                }
            }
        }
    }

    public static void main(String[] args){
        MiroSearchByDFS sol = new MiroSearchByDFS();
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        board[1][1]=1;
        sol.DFS(1, 1);
        System.out.print(answer);
    }
}

