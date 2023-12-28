package com.interview.Sorting;

import java.util.Arrays;

public class MergeSort {
	
	
	void merge(int[] array,int[] left,int[] right) {
		int i =0, j=0, k=0;
		
		while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
	}
	
	
	int[] mergeSort(int[] arr) {

		if(arr.length>1) {
			int mid = arr.length/2;
			int[] left_half = Arrays.copyOfRange(arr, 0, mid);
			int[] right_half = Arrays.copyOfRange(arr, mid, arr.length);
			mergeSort(left_half);
			mergeSort(right_half);
			merge(arr, left_half, right_half);
		}
		return arr;
	}
	
	public int[] sort(int[] arr) {
		return mergeSort(arr);
	}

}
