package method;
import java.util.Scanner;

public class ReversNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, reverse=0;
		System.out.println("enter a no:");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();//1234
		while(num!=0) {
			int digit=num%10;//1234 %10 remainder is 4 ,After store the no 4 in digit
			reverse=reverse*10+digit;//0*10+4=4,after store 4 in reverse
			num/=10;//1234/10=123;after check the condition is not equal to zero,continue the iteration
			
		}
		System.out.println("reverse no" +reverse);

	}

}
