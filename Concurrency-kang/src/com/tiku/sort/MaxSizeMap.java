package com.tiku.sort;

public class MaxSizeMap {
	public static void main(String [] args)
	{
		int[] a = {1,5,2,3,4,7,9,8};
		MaxSizeMap maxSizeMap = new MaxSizeMap();
		maxSizeMap.BubbleSort(a);
		maxSizeMap.shucu(a);
	}
	
	private void BubbleSort(int[] sort){
		
		for(int i = 0;i<sort.length;i++){
			for(int j = 0;j<sort.length-1-i;j++){
				
				int x= 0;
				if(sort[j]>sort[j+1]){
					x = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = x;
				}
			}
		}

	}
	private void shucu(int [] sort){
		
		for(int i = 0;i<sort.length;i++){
			System.out.println(sort[i]);
		}
	}
}
//Ã°ÅÝÅÅÐò