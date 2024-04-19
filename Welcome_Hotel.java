package method;
import java.util.Scanner;

public class Welcome_Hotel 
{
	public static void main(String[] args) 
	{
		int choice,choice2,total=0;
		char ans;
		String order="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Taj Hotel");
		do
		{
			System.out.println("Menu.");
			System.out.println("1.Starters");
			System.out.println("2.Main Course");
			System.out.println("3. Deserts");
			System.out.println("4.SoftDrinks");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
					System.out.println("1.Masala Papad \t\t\t RS.20");
					System.out.println("2.Papdi chat \t\t\t RS.20");
					System.out.println("3.Khaman Dhokala \t\t\t RS.50");
					System.out.println("4.Dahi Vada\t\t\t RS.30");
					choice2=sc.nextInt();
					
					switch(choice2)
					{
					case 1:
						total+=20;
						order+="\nMasala Papad \t RS.20";
						break;
					case 2:
							total+=20;
							order+="\nPapadi chat\t RS.20";
							break;
					case 3:
						total+=50;
						order+="\nKhaman Dhokala \t RS.50";
						break;
					case 4:
						total+=30;
						order+="\nDahi Vada \t RS.30";
						break;
					}
					
				break;
			case 2:
				System.out.println("1.paneer tikka \t\t\t RS.120");
				System.out.println("2. Mutton Birayani  \t\t\t RS.400");
				System.out.println("3.Chiken Curry \t\t\t RS.160");
				System.out.println("4.Mix Veg\t\t\t RS.180");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=120;
					order+="\npaneer tikka \t RS.120";
					break;
				case 2:
						total+=400;
						order+="\nMutton Birayani \t RS.400";
						break;
				case 3:
					total+=160;
					order+="\nchiken curry \t RS.160";
					break;
				case 4:
					total+=180;
					order+="\nMix veg \t RS.180";
					break;
				}
			break;
			case 3:
				System.out.println("1.Smoothie cake \t\t\t RS.120");
				System.out.println("2.Cupcake \t\t\t RS.140");
				System.out.println("3.ice cream \t\t\t RS.160");
				System.out.println("4.Chocalate brownie \t\t\t RS.180");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=120;
					order+="\nSmoothie cake  \t RS.120";
					break;
				case 2:
						total+=140;
						order+="\nCupcake \t RS.140";
						break;
				case 3:
					total+=160;
					order+="\nice cream \t RS.160";
					break;
				case 4:
					total+=180;
					order+="\nChocalate brownie \t RS.180";
					break;
				}
			break;
			case 4:
				System.out.println("1.Jal jeera\t\t\t RS.20");
				System.out.println("2. Cold Coffee \t\t\t RS.30");
				System.out.println("3.Lassi \t\t\t RS.30");
				System.out.println("4.Rooh Afja sharbat \t\t\t RS.20");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=20;
					order+="\njal jeera  \t RS.20";
					break;
				case 2:
						total+=30;
						order+="\nCold coffee\t RS.30";
						break;
				case 3:
					total+=30;
					order+="\nLassi \t RS.30";
					break;
				case 4:
					total+=20;
					order+="\nRooh Afja shrabat \t Rs.20";
					break;
				}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			
			System.out.println("Do you want to add any other ITEm YES/NO");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming :) \nVisit Again");
		System.out.println("Your Orders:\n"+order);
		System.out.println("Your total Bill amount is : "+total);
		System.out.println("Pay by Gpay or CASH");
	}

}




	