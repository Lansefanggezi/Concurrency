package com.tiku.map;

import java.util.Scanner;

public class leanScanner {
	public static void main(String [] args)
	{
		System.out.print("请输入一个数字：");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			System.out.println("数字："+sc.nextInt());
		}
		System.out.println("----------分界线----------");
		while(sc.hasNext())
		{
			System.out.println("应该是输出所以的输入："+sc.next());
		}
	}
}
