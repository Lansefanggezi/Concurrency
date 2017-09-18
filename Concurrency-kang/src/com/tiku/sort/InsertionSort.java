package com.tiku.sort;

public class InsertionSort {
	public static void main(String [] args){
		int [] A = {1,3,5,7,9,0,2,4,6,8,9};
		int n = A.length;
		new InsertionSort().InsertionSort(A, n);
		new InsertionSort().Print(A);
	}
	private void InsertionSort(int [] A, int n){
		for(int i = 1;i<n;i++){
			int get  = A[i];
			int j = i-1;
			while((j>=0)&&(A[j]>get)){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = get;
		}
	}
	private void Print(int[] A){
		for(int i = 0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}
