import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
  int num,temp,rev=0,rem;
Scanner obj=new Scanner(System.in);
System.out.println("Enter number");
num=obj.nextInt();
temp=num;
while(temp!=0) 
  {
     rem=temp%10;
     rev=rev*10+rem;
     temp=temp/10;
  }
if(num==rev)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("Number is not Palindrome");
}
}
}
