package com.amy.sort;

public class BubbleSort {

	public void swapValues(int index1, int index2) {
		int temp = index2;
		index2 = index1;
		index1 = temp;
	}

	public static void main(String[] args) {
		int x[] = { 34, 23, 1, 2, 9, 34, 56 };
		BubbleSort b = new BubbleSort();
		SortUtils.printArray(x);
		b.bubbleSort(x);
		SortUtils.printArray(x);
	}

	public void bubbleSort(int x[]) {
		boolean numberSwitched;
		do{
			numberSwitched=false;
			for(int i=0;i<x.length-1;i++){
				if(x[i+1]<x[i]){
					//if input[i+1] is less than input[i] swap them.
					int temp=x[i+1];
					x[i+1]=x[i];
					x[i]=temp;
					numberSwitched=true;
				}
			}
		}
		while(numberSwitched);
	}
}
