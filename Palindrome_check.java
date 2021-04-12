
//JAVA program to check whether number is a palindrome 

import java.util.*;
import java.util.Scanner ;

class Palindrome_check
{
   public static void main(String args[])
     {
       Scanner obj= new Scanner(System.in);
       System.out.println("Enter the number: ");
       int Number, Remainder , Sum=0;
       Number= obj.nextInt();

       int Check_Number= Number;
       while(Number>0)
        {
          Remainder=Number%10;
          Sum= (Sum*10)+Remainder;
          Number=Number/10;
        }
       if(Check_Number==Sum)
        System.out.println("Yes! its a palindrome");
       else
        System.out.println("No! Check another number");
     }
}