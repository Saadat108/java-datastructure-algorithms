/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;

import java.util.ArrayList;
/**
 *
 * @author Saadat
 */
public class myArrayList {
    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("developer");
        ar.add("tester");
        ar.add("manager");
        System.out.println(ar.get(1));
        for(String str: ar)
        System.out.println(str);
        
        //employee class
        ArrayList<employee> emp = new ArrayList<employee>();
        emp.add(new employee("hussain", 23));
        emp.add(new employee("Saadat", 23));
        emp.add(new employee("Xiaomi", 40));
        for(employee em : emp)
            System.out.println(em.name + ": "+ em.age);
    }
    
    
    static class employee{
        String name;
        int age;
        public  employee(String name, int age){
            this.age=age;
            this.name=name;
        }
    }
}
