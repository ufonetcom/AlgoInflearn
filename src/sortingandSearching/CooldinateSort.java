package sortingandSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //내림차순이던 오름차순이던 음수를 리턴해준다. 현재는 오름차순일때의 상황.
    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class CooldinateSort {
    public static void main(String[] args){
        CooldinateSort sol = new CooldinateSort();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);

    }
}

