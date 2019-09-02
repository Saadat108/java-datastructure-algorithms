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

public class bubbleSorting {
    public static void BubbleSort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = new int []{99,8,7,6,5,4,3,2,1,0,9};
//        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
    }
}
