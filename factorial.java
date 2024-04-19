package method;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,fact=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a no");
		 int no =sc.nextInt();
		while(i<=no) {
			fact=fact*i;
			i++;
		}
		System.out.println("factorial" +fact);
		 
		 
				}

}
