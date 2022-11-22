package week3.day2.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MIssingElementInArray {


	
	public static void main(String[] args) {
			int[] arr = {1,2,3,4,7,6,8};
			List<Integer>list=new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++)
			{
				list.add(arr[i]);
			}
			Collections.sort(list);
			System.out.println("The sorted list is :"+list);
			for(int i=0;i<list.size()-1;i++)
			{
					if(list.get(i+1)!=list.get(i)+1)
					{
						System.out.println("Missing Element in Array is: "+ (list.get(i)+1));
						break;
					}
			}
	}
	}

