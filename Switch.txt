package method;
import java.util.*;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int choice, res,num1,num2;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Arthmetic operator,\n2:Assignment Operator\n,3:logical,\n4:conditional,\n5:ternary");
		choice=sc.nextInt();		
       
		switch(choice){
        		
        case 1:
        	System.out.println("enter a 2 no");
        	num1=sc.nextInt();
            num2=sc.nextInt();
            res=num1+num2;
            res=num1*num2;
            res=num1-num2;
            res=num1%num2;
            res=num1/num2;
           System.out.println("addition"+(num1+num2));
           System.out.println("subtract"+(num1-num2));
           System.out.println("Multiplication"+(num1*num2));
           System.out.println("division"+(num1/num2));
           System.out.println("module"+(num1+num2));
           break;
            
            
        case 2:
        	System.out.println("enter a  no");
        	num1=sc.nextInt();
            num1+=10;
            System.out.println("num "+ num1);
            num1-=10;
            System.out.println("num "+ num1);
            break;
           
        case 3:
        	num1=sc.nextInt();
            num2=sc.nextInt();
            res=num1&num2;
            res=num1^num2;
            res=num1|num2;
             
            System.out.println("AND"+res);
            System.out.println("OR"+res);
            System.out.println("XOR"+res);
            break;
        case 4:
        	System.out.println("logical operator");
        	System.out.println("c is true,/n d is false");
        	boolean c=true,d=false;
        	boolean result2;
            result2=c&&d;
            System.out.println("logical AND"+result2);
            result2=!(c||d);
            System.out.println("logical Not"+result2);
            result2=c||d;
            System.out.println("logical OR "+result2);
            break;
        case 5:
        	System.out.println("enter a 2 no");
        	int num4=sc.nextInt();
        	int num5=sc.nextInt();
        	
        	 int res3 =(num4>num5)?(num4+num5):(num4-num5);
        	System.out.println("num is"+res3);
        	break;
       default:
    	   System.out.println("invalid choice.please enter no btween 1 to 5");
           
            
            
            
            
            
            
        }
	}

}
