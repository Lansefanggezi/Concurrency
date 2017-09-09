package com.tiku.sort;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args){
		int[] A = {1,3,5,7,9,2,8,2,4,6};
		for(int i = 0;i<A.length-1;i++){
			int max = i;
			for(int j = i + 1;j<A.length;j++){
				if(A[j]>A[max]){
					max = j;
				}
			}
			new SelectionSort().Swap(A, i, max);
		}
		new SelectionSort().print(A);
	}
	private void Swap(int [] A , int i, int j){
		int temp ;
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	private void print(int [] A){
		for(int i = 0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}
