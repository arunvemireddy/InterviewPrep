package com.interview.Sorting;

public class BubbleSort {
	
	int[] swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}
	
	public int[] sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr = swap(arr,i, j);
				}
			}
		}
		return arr;
	}

}
