package method;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		Scanner sc = new Scanner(System.in); 
		    System.out.println("enter no min value");
			min=sc.nextInt();
			System.out.println("enter a max value");
			max=sc.nextInt();
		
		while(min<=max) {
			if(min%2==0)
			{
				System.out.println(min+"");
			}
			min++;
		}
	}

}
