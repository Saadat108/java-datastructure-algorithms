/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;

import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Saadat
 */
public class myLinkedList {
    public static void main(String[] args){
        LinkedList<String> ls= new LinkedList<String>();
        ls.add("hussain");
        ls.add("selena");
        ls.add("mammu");
        Iterator<String> itr = ls.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        LinkedList<employee> emp = new LinkedList<employee>();
        emp.add(new employee("choyon", 30));
        emp.add(new employee("majhi", 20));
        emp.add(new employee("shawmik", 24));
        
}
    
}
class employee{
    int age;
    String name;
    public employee(String name, int age){
        this.age=age;
        this.name=name;
    }
}