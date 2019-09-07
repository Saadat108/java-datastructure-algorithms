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
public class MergeSort {
    int[] arr;
    int[] tempArr;
    public static void main(String[] args){
        int[]arr= {1,50,30,10,60,80};
        System.out.println("before Sorting");
        System.out.println(Arrays.toString(arr));
        
        new MergeSort().PrepareForSort(arr);
        System.out.println("after Sorting");
        System.out.println(Arrays.toString(arr));
    }
    void PrepareForSort(int[] arr){
        this.arr=arr;
        this.tempArr=new int[arr.length];
        doMergeSort(0, arr.length-1); //(  
    }
    void doMergeSort(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middleIndex=(lowerIndex+higherIndex)/2;
            doMergeSort(lowerIndex, middleIndex);
            doMergeSort(middleIndex+1, higherIndex);
            MergePart(lowerIndex, middleIndex, higherIndex);
        }
    }
    void MergePart(int lowerIndex, int middleIndex, int higherIndex){
        for(int i=lowerIndex; i<=higherIndex; i++){ // copy original array to temp array
            tempArr[i]= arr[i];
            System.out.println("tempArr: " + Arrays.toString(tempArr)+" low:"+lowerIndex+ " mid:"+middleIndex+ " high"+higherIndex );
        }
        
        int i= lowerIndex;
        int j= middleIndex+1;
        int k= lowerIndex;
        while(i<=middleIndex && j<=higherIndex){
            if(tempArr[i]<= tempArr[j]){
                arr[k]= tempArr[i];
                i++;
            }else{
               arr[k]= tempArr[j];
               j++;
            }
            k++;
        }
        while(i<=middleIndex){
            arr[k]=tempArr[i];
            k++;
            i++;
        }
    }
}
