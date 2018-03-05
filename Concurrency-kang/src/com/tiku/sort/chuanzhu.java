package com.tiku.sort;

import java.util.Scanner;

public class chuanzhu {
	public static void main(String[] args) {
		System.out.print("请输入数字：");
		Scanner sc = new Scanner(System.in);

		// 串珠个数
		int n = sc.nextInt();
		// 最多相邻个数
		int m = sc.nextInt();
		// 颜色个数
		int c = sc.nextInt();
		int error;
		int[][] A = new int[n + 1][c + 1];
		for (int i = 0; i < n; i++) {
			int next_i = sc.nextInt();
			A[i][0] = next_i;
			for (int j = 1; j < next_i + 1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		error = new chuanzhu().findClolr(A, m, n, c);
		System.out.println(error);
	}

	// 当前串珠的颜色不能和相邻m个行里的数相等
	private int findClolr(int[][] A, int m, int n, int c) {
		// 不符合个数
		int error = 0;
		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				for (int x = 0; x < m; x++) {
					if(i+x < c+1){
					for (int q = 1; q < c + 1; q++) {
						if (!(A[i][j] == 0)) {
							if (A[i][j] == A[x+i][q]) {
								error++;
							}
						}
					}
					}else{
						for (int q = 1; q < c + 1; q++) {
							if (!(A[i][j] == 0)) {
								if (A[i][j] == A[x+i-c-1][q]) {
									error++;
								}
							}
						}
					}
				}
			}
		}
		return error;
	}
}
