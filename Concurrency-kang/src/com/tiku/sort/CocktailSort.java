package com.tiku.sort;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CocktailSort {
	public static void main(String[] args) {

		int[] A = { 1, 4, 5, 8, 3, 2, 6, 0, 4, 9 };
		System.out.print("请输入一组数字:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			if (sc.hasNextInt()) {
				A[i] = sc.nextInt();
			}
		}
		int lift = 0;
		int right = A.length - 1;

		while (lift < right) {
			lift++;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1]) {
					new CocktailSort().Swap(A, i, i + 1);
				}
			}
			right--;
			for (int j = A.length - 1; j > 0; j--) {
				if (A[j] < A[j - 1]) {
					new CocktailSort().Swap(A, j, j - 1);
				}
			}
		}
		new CocktailSort().Print(A);
	}

	private void Swap(int[] A, int i, int j) {
		int change;
		change = A[i];
		A[i] = A[j];
		A[j] = change;
	}

	private void Print(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
