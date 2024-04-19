package method;

import java.util.Scanner;

public class Check_PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,res=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no:");
		num=sc.nextInt();
		for(i=2;i<num/2;++i) {
			if(num%i==0)
			{
				res++;
				break;
				
			}
		}
		if (res/2==0) {
			System.out.println("\nit is prime no");
		}
		else
			System.out.println("\n it is not prime no");

	}

}
