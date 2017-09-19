package com.tiku.sort;

public class InsertionSortDichotomy {
	public static void main(String [] args){
		int A[] = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };// 从小到大二分插入排序
		int n = A.length;
		new InsertionSortDichotomy().InsertionSortDichotomy(A, n);
		new InsertionSortDichotomy().print(A);
	}
	private void print(int [] A){
		for(int i = 0 ; i<A.length ; i++){
			System.out.println(A[i]);
		}
	}
	private void InsertionSortDichotomy(int [] A ,int n){
		for(int i = 1;i<n ;i++){
			int get = A[i]; //右手抓到一张牌
			int left = 0;	//左手的牌是拍好序的，可以使用二分法
			int right = i-1;	//初始化左手序列的两端
			while(left<=right){
				int mid = (left + right)/2;
				if(A[mid]>get){
					right = mid -1;    //不再比较mid
				}else{
					left = mid +1;		//不再比较mid
				}
			}
			for(int j = i -1;j>=left;j--){
				A[j+1] = A[j];
			}
			A[left] = get;
		}
	}
}
