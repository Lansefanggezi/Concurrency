package com.tiku.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SizeMap {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Map<String,String> map = new HashMap<String,String>();
		new SizeMap().chushihuaMap(map);
		int num;
		
		String [] strLine = new String[100];
		while(sc.hasNextInt())
		{
			num = sc.nextInt();
			for(int i = 0;i<num;i++){
				strLine[i] = sc.next();
			}
		}
//		for(int a = 9; a<strLine.)
//		{
//			
//		}
		
	}
	private void chushihuaMap(Map<String,String> map)
	{
		map.put("A", "0");
		map.put("B", "0");
		map.put("C", "0");
		map.put("D", "0");
		map.put("E", "0");
		map.put("F", "0");
		map.put("G", "0");
		map.put("H", "0");
		map.put("I", "0");
		map.put("J", "0");
	}
}
