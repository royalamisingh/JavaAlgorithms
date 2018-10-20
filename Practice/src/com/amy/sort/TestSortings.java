package com.amy.sort;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class TestSortings {
	
	@Test
	public void testBubbleSort()
	{
		int input[]={6,3,8,9,12,11};
		int expected[]={3,6,8,9,11,12};
		boolean numberSwitched;
		do{
			numberSwitched=false;
			for(int i=0;i<input.length-1;i++){
				if(input[i+1]<input[i]){
					//if input[i+1] is less than input[i] swap them.
					int temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
					numberSwitched=true;
				}
			}
		}
		while(numberSwitched);
		
		assertArrayEquals(expected,input);
	}
	private List<Integer> getNumbersList(){
		List<Integer> list=Arrays.asList(6,3,8);
	    return list;
	}
	@Test
	public void testInsertionSort()
	{
      List<Integer> originalList=getNumbersList();
	  List<Integer> sortedList=new LinkedList<>();
	  originalList:for(Integer num:originalList){
		  for(int i=0;i<sortedList.size();i++){
			  if(num<sortedList.get(i)){
				  sortedList.add(i,num);
				  continue originalList;
			  }
		  }
		  sortedList.add(sortedList.size(),num);
	  }
     System.out.println(sortedList);
	}
}
