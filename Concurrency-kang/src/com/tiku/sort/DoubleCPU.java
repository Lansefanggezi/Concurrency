/**
 * @author Carl
 * @date 2017/10/12
 * */
package com.tiku.sort;

import java.util.Scanner;

public class DoubleCPU {
	/**
	 * ˫������
	 * ֻ���뵽���Լ������������ʱ����ǰ�����ʱ����ӳ��Զ���Ȼ������������ӽ����ֵ
	 * ��������֮�󣬷������Ǳ������⣬�Ժ�����������
	 * */
	public static void main(String [] args){
		int num = 0;
		Scanner scan = new Scanner(System.in);
		num = Integer.valueOf(scan.nextLine());
		String [] strings = scan.nextLine().split(" ");
		int [] task = new int [num];
		int sum = 0; //��������ʱ���ܺ�
		
		for(int i = 0; i<num; i++){
			task[i] = Integer.valueOf(strings[i]) / 1024;
			sum = sum + task[i];
		}
		int [] [] handler = new int[num +1][sum/2 +1];
		for(int i =0;i<num;i++){
            for (int j = 0; j <= sum / 2; j++) {  
                handler[i][j] = i == 0 ? 0 : handler[i - 1][j];  
                if (i > 0 && j >= task[i - 1])  
                    //handler[i][j]����ǰi������װ����Ϊj�ı����ܹ�װ�µ����ֵ  
                    //handler[i - 1][j - task[i - 1]] + task[i - 1]:��ʾ��i������װ�����������  
                    //handler[i - 1][j]:��ʾ��i����Ʒ��װ�����������  
                    handler[i][j] = Math.max(handler[i - 1][j],handler[i - 1][j - task[i - 1]] + task[i - 1]);  
            }  
            
        //����������˭�ֵ�������࣬�Ը������  
        System.out.println(Math.max(handler[num][sum / 2], sum- handler[num][sum / 2]) * 1024);  
			
		}
	}
}
