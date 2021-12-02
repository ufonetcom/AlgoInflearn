package recursiveTreeGraphexDFSBFS;

class Node{
    int data;
    Node lt, rt; //왼쪽,오른쪽 자식의 주소 저장
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public class DFSBinaryTree {
    Node root;
    public void DFS(Node root) {
        if(root==null) return; //부모의 위치에따라 전휘,중휘,후휘순회의 기준이 달라짐.
        else {
            DFS(root.lt);
            System.out.print(root.data+" "); //이 줄의 의미는 부모노드
            DFS(root.rt);
        }

    }

    public static void main(String[] args){
        DFSBinaryTree tree = new DFSBinaryTree();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}

