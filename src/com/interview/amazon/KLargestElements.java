package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.interview.Sorting.BubbleSort;
import com.interview.Sorting.MergeSort;
import com.interview.Sorting.QuickSort;

public class KLargestElements {
	
// using PriorityQueue
	public void printKLargest1(int[] arr, int k) {	
		int[] array = Arrays.copyOf(arr, arr.length);
		Queue<Integer> queue = new PriorityQueue<>();
		
		for (Integer integer : array) {
			queue.add(integer);
			if(queue.size()>3) {
				queue.poll();
			}
		}

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
	
//  using Sorting techniques
	public void printKLargest2(int[] arr, int k) {
		
		int arrLength = arr.length;
		
//		BubbleSort
		BubbleSort bubbleSort = new BubbleSort();
		int[] sortedArr = bubbleSort.sort(arr);
		
		System.out.print("Using BubbleSort - ");
		System.out.println(Arrays.toString(Arrays.copyOfRange(sortedArr, arrLength-k, arrLength)));
		
		
//		QuickSort
		QuickSort quickSort = new QuickSort();
		int[] sortedArr1 = quickSort.sort(arr);
		
		System.out.print("Using QuickSort - ");
		System.out.println(Arrays.toString(Arrays.copyOfRange(sortedArr1, arrLength-k, arrLength)));
		
		
//		MergeSort
		MergeSort mergeSort = new MergeSort();
		int[] sortedArr2 = mergeSort.sort(arr);
		
		System.out.print("Using MergeSort - ");
		System.out.println(Arrays.toString(Arrays.copyOfRange(sortedArr2, arrLength-k, arrLength)));
		
	}
	
	// using ArrayList
		public  void printKLargest3(int[] arr, int k) {	
			System.out.println("Using ArrayList");
			
			List<Integer> integers = new ArrayList<>();
			
			for(int i:arr) {
				integers.add(i);
			}
			
			for(int i:integers) {
				System.out.println(i);
			}

		}
		
	public static void main(String[] args) {
		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;
		KLargestElements kLargestElements = new KLargestElements();
		kLargestElements.printKLargest1(arr, k);
		kLargestElements.printKLargest2(arr, k);
		kLargestElements.printKLargest3(arr, k);
	}

}
