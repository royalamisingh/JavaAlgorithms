package com.amy.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int input[]={6,3,8,9,12,11};
		int i,j,key,temp;
		for(i=1;i<input.length;i++){
			key = input[i];
			System.out.println("Key:::::"+key);
			for(j=i-1;j>=0;j--){
				System.out.println("input in j block is::" + input[j]);
				if(key<input[j]){
					System.out.println(key + " :is less than: " +input[j]);
					temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
			
		}
		SortUtils.printArray(input);
	}

}
