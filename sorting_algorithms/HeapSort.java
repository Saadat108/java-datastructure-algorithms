/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_algorithms;

import java.util.Arrays;

/**
 *
 * @author Saadat
 */
public class HeapSort {
    static int total; // number of elements to be sorted
    static void swap(Comparable[] arr, int a, int b){
        Comparable temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp; 
    }
    static void heapify(Comparable[] arr, int i){
        int left= i*2;
        int right= i*2 +1;
        int grt=i;
        
        if(left<= total && arr[left].compareTo(arr[grt])>=0){
            grt=left;
        }
        if(right<= total && arr[right].compareTo(arr[grt])>=0){
            grt=right;
        }
        if(grt!=i){
            swap(arr, i, grt);
            heapify(arr, grt);
        }
        
    }
    static void sort(Comparable[] arr){
         total=arr.length-1;   
         for(int i=total/2; i>=0; i--){ // this for loop deterates from the midpint to the 0-th element to make a heap
             heapify(arr, i);
         }
         for(int i=total; i>0; i--){
             swap(arr, 0, i);
             total--;
             heapify(arr, 0);
         }
        }
    public static void main(String[] args){
        Integer[]arr= {1,50,30,10,60,80};
        System.out.println("before Sorting");
        System.out.println(Arrays.toString(arr));
        
        sort(arr);
        System.out.println("after Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
    

