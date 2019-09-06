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
public class QuickSorting {
    static void QuickSort(int[] arr, int low, int high){
        if(low>high) return;
        int mid =(high+low)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
            
        }
        if(low<j){
            QuickSort(arr, low, j);
        }
        if(high>i){
            QuickSort(arr, i, high);
        }
    }
    public static void main(String[] args){
        int[] arr = new int []{99,8,7,6,5,4,3,2,1,0,9};
        System.out.println("brfore sorting: ");
        System.out.println(Arrays.toString(arr));
        QuickSort(arr, 0, arr.length-1);
        System.out.println("brfore sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
