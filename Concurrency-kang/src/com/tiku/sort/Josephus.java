/**
 * @author Carl
 * @data 2017/10/11
 * */
package com.tiku.sort;

import java.util.Scanner;

public class Josephus {
	//������������Լɪ�������һ�����֣�N��С��Χ��һ��Ȧ�������1��N���ӱ��Ϊm��С����ʼ������
	//����L��С���˳���Ϸ��Ȼ���ڿ�ʼ��L��С�������ʣ�µ�С����ʤ
	public static void main(String [] args){
		System.out.println("������һ�����֣�");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int counter = n;//������
		int num = 1; //����
		int [] array = new int [n];//��������
		
		//��ʼ������
 		for(int i = 0;i<array.length;i++){
			array[i] = 1; 
		}
		while(counter > 1){
			for(int j = 0;j<array.length;j++){
				if(array[j] != 0){
					array[j] = num;
					if(num%3 == 0){
						array[j] = 0;
						counter --;
						if(counter == 1){
							break;
						}
					}
					num ++;
				}
			}
		}
		for(int k = 0; k<n; k++){
			if(array[k] != 0){
				System.out.println("ʤ��������ǣ�" + (k+1));
			}
		}
	}
}
