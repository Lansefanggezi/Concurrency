package com.tiku.sort;

public class InsertionSortDichotomy {
	public static void main(String [] args){
		int A[] = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };// ��С������ֲ�������
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
			int get = A[i]; //����ץ��һ����
			int left = 0;	//���ֵ������ĺ���ģ�����ʹ�ö��ַ�
			int right = i-1;	//��ʼ���������е�����
			while(left<=right){
				int mid = (left + right)/2;
				if(A[mid]>get){
					right = mid -1;    //���ٱȽ�mid
				}else{
					left = mid +1;		//���ٱȽ�mid
				}
			}
			for(int j = i -1;j>=left;j--){
				A[j+1] = A[j];
			}
			A[left] = get;
		}
	}
}
