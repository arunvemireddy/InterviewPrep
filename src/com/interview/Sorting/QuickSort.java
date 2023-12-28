package com.interview.Sorting;

public class QuickSort {
	
	
	int[] swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	int pivot(int[] arr, int pivotIndex,int endIndex) {
		int swapIndex = pivotIndex;
		for(int i=pivotIndex+1;i<=endIndex;i++) {
			if(arr[i]< arr[pivotIndex]) {
				swapIndex++;
				swap(arr, swapIndex, i);
			}
		}
		swap(arr, pivotIndex,swapIndex);
		return swapIndex;
	}
	
	void quickSortHelper(int[] array,int left,int right) {
		if(left<right) {
			int pivotIndex = pivot(array,left,right);
			quickSortHelper(array,left,pivotIndex-1);
			quickSortHelper(array,pivotIndex+1,right);
		}
	}
	
	public int[] sort(int[] arr) {
		quickSortHelper(arr, 0, arr.length-1);
		return arr;
	}

}
