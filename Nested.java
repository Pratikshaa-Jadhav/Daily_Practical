package method;
import java.util.*;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1:odd or even,\n 2:check positiv negative no,\n3:find out cube");
		 choice= sc.nextInt();
		 
	switch(choice) {
	case 1:
	int x;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter x Value");
	x=sc.nextInt();
	if(x>0)
	{ 
	    if(x%2==0)
	    {
	    System.out.println("Even Number");
	    }
	    else
	    {
	    System.out.println("Odd Number");
	    }
	}

	else	{
	System.out.println("Pls Enter Positive Number");
		}
	break;
	
	case 2:
	    double number = 12.3;

     
        if (number < 0.0)
        	System.out.println(number + " is a negative number.");

        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

       
        else
            System.out.println(number + " is 0.");
      break;
      
	case 3:
		System.out.println("cube no is 10 to 50");
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Cube of " + i + " is: " + (i * i * i));
            } else if (i % 3 == 0) {
                System.out.println("Cube of " + i + " is: " + (i * i * i));
            } else {
                System.out.println("Cube of " + i + " is: " + (i * i * i));
            }
        }
        break;
           
   default:
	   System.out.println("enter a no between 1 to 3");
    	
    	
    	
            
      
	
	}
		
			

	}

}
