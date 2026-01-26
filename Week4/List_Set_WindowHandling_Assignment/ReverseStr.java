package list.set.window.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStr {

	public static void main(String[] args) {

   String[] companys = {"Wipro","HCL","Aspire Systems","CTS"};
   
   List<String> companysLi = new ArrayList<>();
   
   for(String i :companys)
   {
	   companysLi.add(i);
   }
   
   Collections.sort(companysLi);
   
   for(int i=companysLi.size()-1;i>=0;i--)
   {
	  System.out.println(companysLi.get(i)); 
   }
   
	}

}
