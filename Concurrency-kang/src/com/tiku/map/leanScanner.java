package com.tiku.map;

import java.util.Scanner;

public class leanScanner {
	public static void main(String [] args)
	{
		System.out.print("������һ�����֣�");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			System.out.println("���֣�"+sc.nextInt());
		}
		System.out.println("----------�ֽ���----------");
		while(sc.hasNext())
		{
			System.out.println("Ӧ����������Ե����룺"+sc.next());
		}
	}
}
