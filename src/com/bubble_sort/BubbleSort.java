package com.bubble_sort;

public class BubbleSort {

	public static int[] sort(int[] array) {
	    // Write your code here.
			
			int length= array.length;
			boolean  swapped ;
			for(int  i= 0; i<length -1;i++){
				swapped = false;
				for(int j =0; j<length -i -1 ;j++){
					if(array[j]> array[j+1]){
						int swapEle =  array[j];
						array[j] = array[j+1];
						array[j+1] = swapEle;
						swapped = true;
					}
					
				}
				if(!swapped) break;
			}
			
	    return array;
	  }
}

//Sorting In Place: Yes
//Stable: Yes
//Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
//Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
//Auxiliary Space: O(1)
//Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
