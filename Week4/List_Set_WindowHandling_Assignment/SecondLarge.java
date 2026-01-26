package list.set.window.assign;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLarge {

	public static void main(String[] args) {
		
		int[] a= {3, 2, 11, 4, 6, 7};
		
		List<Integer> array1=new ArrayList<>();
		
		for(int i : a)
		{
			array1.add(i);
		}
		
		Collections.sort(array1);
		
		int SecondLargest = array1.get(array1.size()-2);
			
		System.out.println("The 2nd Largest number is :"+SecondLargest);
		

	}

}
