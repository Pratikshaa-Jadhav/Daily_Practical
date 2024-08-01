
//Write a program to print the frequency of each character in a String.


package method;

import java.util.Scanner;

public class FrequencyOfCharactersInAString {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : ");
     String str = sc.nextLine(); 
     int[] freq = new int[str.length()]; 
     int i, j; 

     //Converts given string into character array 
     char string[] = str.toCharArray(); 
     for(i = 0; i <str.length(); i++) { 
        freq[i] = 1; 
          for(j = i+1; j <str.length(); j++) { 
            if(string[i] == string[j]) { 
            freq[i]++; 

           //Set string[j] to 0 to avoid printing visited character 
            string[j] = '0'; 
          } 
       } 
    } 
  
     /* Output:
     Enter String : Pratiksha
     Characters and their corresponding frequencies
     P-1
     r-1
     a-2
     t-1
     i-1
     k-1
     s-1
     h-1*/