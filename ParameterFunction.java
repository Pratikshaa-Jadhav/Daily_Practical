package method;
import java.util.*;

public class ParameterFunction {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;//local variable
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two no:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		Subtraction(num1,num2);
		/*Addition(num1,num2);
		division(num1,num2);
		Multiplication(num1,num2);
		Modulse(num1,num2);*/
		
		
		public void Subtraction(int num1,int num2)
		
		{
			int sum=num1-num2;
			System.out.println("Subtraction"+sum);
		}

	}

}
