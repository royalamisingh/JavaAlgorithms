package com.amy.sampple;

public class Sample {

	public static void main(String[] args) {
		int sortedArray[] = {1,4,6,12,15,17};
		int x=12;
		int l=0,r=sortedArray.length-1,m;
		
		while(l<=r){
			m = (l+r)/2;
			if(x==sortedArray[m]){
				System.out.println("element is at index:"+m);
				break;
			}
			else if(x>sortedArray[m]){
				l=m+1;
			}
			else{
				r=m-1;
			}
		}
	}

}
