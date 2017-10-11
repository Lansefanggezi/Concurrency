/**
 * @author Carl
 * @data 2017/10/11
 * */
package com.tiku.sort;

import java.util.Scanner;

public class Josephus {
	//丢手帕问题是约瑟夫问题的一个变种，N个小孩围成一个圈，标号是1到N，从编号为m的小孩开始数数，
	//数到L个小孩退出游戏，然后在开始数L个小孩，最后剩下的小孩获胜
	public static void main(String [] args){
		System.out.println("请输入一个数字：");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int counter = n;//计数器
		int num = 1; //数数
		int [] array = new int [n];//声明数组
		
		//初始化数组
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
				System.out.println("胜利的玩家是：" + (k+1));
			}
		}
	}
}
