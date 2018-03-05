package com.tiku.sort;

import java.util.Scanner;

public class chuanzhu {
	public static void main(String[] args) {
		System.out.print("���������֣�");
		Scanner sc = new Scanner(System.in);

		// �������
		int n = sc.nextInt();
		// ������ڸ���
		int m = sc.nextInt();
		// ��ɫ����
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

	// ��ǰ�������ɫ���ܺ�����m������������
	private int findClolr(int[][] A, int m, int n, int c) {
		// �����ϸ���
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
