package recursiveTreeGraphexDFSBFS;

//부분집합 구하기(DFS)
public class DFSApartSet {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if(L==n+1){
            String tmp="";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp); //공집합(0)이 아니면 출력한다.
        }else {
            ch[L]=1;
            DFS(L+1); //왼쪽(사용한다)
            ch[L]=0;
            DFS(L+1); //오른쪽(사용하지 않는다)
        }
    }

    public static void main(String[] args){
        DFSApartSet sol = new DFSApartSet();
        n = 3;
        ch = new int[n+1];
        sol.DFS(1);
    }
}

