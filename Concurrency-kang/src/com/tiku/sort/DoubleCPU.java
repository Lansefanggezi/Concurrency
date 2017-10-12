/**
 * @author Carl
 * @date 2017/10/12
 * */
package com.tiku.sort;

import java.util.Scanner;

public class DoubleCPU {
	/**
	 * 双核问题
	 * 只能想到可以计算出理想的最佳时间就是把所有时间相加除以二，然后让其他组最接近这个值
	 * 上网查了之后，发着这是背包问题，稍后解决背包问题
	 * */
	public static void main(String [] args){
		int num = 0;
		Scanner scan = new Scanner(System.in);
		num = Integer.valueOf(scan.nextLine());
		String [] strings = scan.nextLine().split(" ");
		int [] task = new int [num];
		int sum = 0; //计算任务时间总和
		
		for(int i = 0; i<num; i++){
			task[i] = Integer.valueOf(strings[i]) / 1024;
			sum = sum + task[i];
		}
		int [] [] handler = new int[num +1][sum/2 +1];
		for(int i =0;i<num;i++){
            for (int j = 0; j <= sum / 2; j++) {  
                handler[i][j] = i == 0 ? 0 : handler[i - 1][j];  
                if (i > 0 && j >= task[i - 1])  
                    //handler[i][j]：用前i个物体装容量为j的背包能够装下的最大值  
                    //handler[i - 1][j - task[i - 1]] + task[i - 1]:表示第i个物体装进背包的情况  
                    //handler[i - 1][j]:表示第i件物品不装进背包的情况  
                    handler[i][j] = Math.max(handler[i - 1][j],handler[i - 1][j - task[i - 1]] + task[i - 1]);  
            }  
            
        //两个处理器谁分的任务更多，以更多地算  
        System.out.println(Math.max(handler[num][sum / 2], sum- handler[num][sum / 2]) * 1024);  
			
		}
	}
}
