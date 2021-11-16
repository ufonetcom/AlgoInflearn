package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<arr.length; i++) queue.offer(new Person(i,arr[i]));
        while (!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(tmp.priority<x.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        EmergencyRoom sol = new EmergencyRoom();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i : arr) arr[i]=kb.nextInt();
        System.out.print(sol.solution(n,m,arr));

    }
}

