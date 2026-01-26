package list.set.window.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

int[] elements = {1,2,3,4,10,6,7};

   List<Integer> missingNumbers = new ArrayList<>();
   
   for (int i : elements)
   {
	   missingNumbers.add(i);
   }
   
   System.out.println("Array :"+missingNumbers);
   
   Collections.sort(missingNumbers);
   
   System.out.println("Sorted Array :"+missingNumbers);
   
   for (int i = 0; i < missingNumbers.size() - 1; i++) {

		int current = missingNumbers.get(i);
		int next = missingNumbers.get(i + 1);

		if (current + 1 != next) {
			for (int missing = current + 1; missing < next; missing++) {
				System.out.println("Missing Number : " + missing);
			} 
	   }
   }
	}
	}

