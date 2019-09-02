/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
/**
 *
 * @author Saadat
 */
public class myQueue {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<String>();
        q.add("this");
        q.add("is");
        q.add("inside");
        q.add("a");
        q.add("Queue");
        System.out.println(q.peek());
        System.out.println(q.poll());
        
        // Priority Queue => pops element with least priority
        System.out.println("");
        System.out.println("Priority Queue");
        PriorityQueue<Integer> pQ= new PriorityQueue<Integer>();
        pQ.add(12);
        pQ.add(11);
        pQ.add(10);
        pQ.add(14);
        pQ.add(20);
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());
        
        
        System.out.println("");
        System.out.println("priority queue for student");
        PriorityQueue<Student> pqStudents = new PriorityQueue<Student>();
        pqStudents.add(new Student("Bill Gates", 21));
        pqStudents.add(new Student("Steve Jobs", 22));
        pqStudents.add(new Student("Steve Wozniak", 23));
        pqStudents.add(new Student("Warren Buffet", 27));
        System.out.println(pqStudents.poll().name);
    }
}
