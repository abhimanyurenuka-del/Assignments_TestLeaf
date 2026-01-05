package assignment;
import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int count=0;
		
		if(n<=1) {
			System.out.println("the number is not prime");
			
		}
		else
		{
			
		for(int i=2; i<n; i++)
			
		{
			
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			{
				System.out.println("The number is prime");	
				
			}
			else
			{
				System.out.println("The number is not prime");
				
			}
		
		}
		
	}

}
