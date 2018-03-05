package com.tiku.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("shuru:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList [] matrix = new ArrayList[n];
		for(int i = 0; i<n;i++){
			matrix[i].add(sc.nextInt());
		}
	}
}
