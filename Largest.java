import java.util.Scanner;
class Largest 
{
public static void main(String args[])
{
  int num1,num2,num3;
Scanner obj=new Scanner(System.in);
System.out.println("Enter first number");
num1=obj.nextInt();
System.out.println("Enter Second number");
num2=obj.nextInt();
System.out.println("Enter Third number");
num3=obj.nextInt();
      if (num1>num2 && num1>num3)
       {
	 System.out.println("Num1 is greater : "+num1);
       }
      else if(num2>num3 && num2>num1)
       {
         System.out.println("Num2 is greater : "+num2);
        }
      else
        {
	 System.out.println("Num3 is greater : "+num3);
       }
}
}

