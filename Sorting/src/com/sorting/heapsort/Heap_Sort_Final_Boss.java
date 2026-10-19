package com.sorting.heapsort;

import java.util.Arrays;

public class Heap_Sort_Final_Boss {
	public static void main(String[] args) {
		int [] arr= {3,5,2,8,1,9,0};
		heapSort(arr);
		System.out.println("Sorted array is :"+Arrays.toString(arr));
	}
	
	public static void heapify(int[] arr,int n,int i) {
		int largest=i;
		int leftchild=2*i+1;
		int rightchild=2*i+2;
		
		if(leftchild<n && arr[leftchild]>arr[largest]) {
			largest=leftchild;
		}
		if(rightchild<n && arr[rightchild]>arr[largest]) {
			largest=rightchild;
		}
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr, n, largest);
		}
	}
	
	public static void buildMaxHeap(int arr[],int totalLength) {
		int lastNonLeafIndex = (totalLength / 2) - 1; 
		for (int i = lastNonLeafIndex; i >= 0; i--) {
		heapify(arr, totalLength, i);
		}
	}
	
	public static void heapSort(int arr[]) {
		int n=arr.length;
		
		if(arr==null || arr.length==1) {
			return;
		}
		buildMaxHeap(arr, n);
		for(int end=n-1;end>0;end--) {
			int temp=arr[end];
			arr[end]=arr[0];
			arr[0]=temp;
			heapify(arr, end, 0);
		}
		
	}
}