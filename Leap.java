import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
int year;
Scanner obj = new Scanner(System.in);
System.out.println("Enter Year");
year=obj.nextInt();
 if((year%4)==0)
   {
     if((year%100)==0)
       {
         if((year%400==0))
           {
         System.out.println("LEAP YEAR");
           }
         else 
           {
           System.out.println("NOT LEAP YEAR");
           }
         } 
         else 
           {
           System.out.println("LEAP YEAR");
           }
       }
       else 
           {
           System.out.println("NOT LEAP YEAR");
           }
}
}

