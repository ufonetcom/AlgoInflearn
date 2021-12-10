package recursiveTreeGraphexDFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//무엇의 최소를 구하여라 -> 최단거리탐색 구하는 문제
//처음 트리구조를 생각해보면 각 노드들은 3가지의 점프방법으로 이동된 위치가 노드가 되고, 갈래는 3가지 점프방법이기때문에 세갈래가 된다.
//또한 트리의 레벨은 문제에서 답을 요하는 트리의 L(레벨)이 된다.
public class LookForCowbyBFS {
    int answer=0;
    int[] dis={1, -1, 5}; //한번 점프할때 점프방법.
    int[] ch; //방문 체크배열.
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch=new int[10001]; //직선의 좌표점은 1 ~ 10000 까지.
        ch[s]=1;
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()){
            int len=Q.size();

            for(int i=0; i<len; i++){
                int x=Q.poll();
                for(int j=0; j<3; j++){
                    int nx=x+dis[j];
                    if(nx==e) return L+1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0){ //방문하지 않은 노드라면
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args){
        LookForCowbyBFS sol = new LookForCowbyBFS();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt(); //현수의 위치
        int e=kb.nextInt(); //송아지의 위치

        System.out.println(sol.BFS(s, e));
    }
}

