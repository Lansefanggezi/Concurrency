
package com.tiku.map;

public class maxSizeMap {
	public static void main(String []args)
	{
		int[] sort = {1,5,2,3,4,7,9,8};
		for(int i = 0;i<sort.length;i++){
			for(int j = 0;j<sort.length;j++){
				//tishen
				int x= 0;
				if(sort[j]>sort[j+1]){
					x = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = x;
				}
			}
		}
		for(int i = 0;i<sort.length;i++){
			System.out.println(sort[i]);
		}
	}
}
