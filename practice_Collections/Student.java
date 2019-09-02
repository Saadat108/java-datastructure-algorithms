/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;

/**
 *
 * @author Saadat
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age==o.age){
            return 0;
        }
        else if(this.age > o.age){
            return 1;
        }
        else{
            return -1;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
