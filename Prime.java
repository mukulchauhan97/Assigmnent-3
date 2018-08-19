import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
  int num,flag=0,i;
Scanner obj=new Scanner(System.in);
System.out.println("Enter number");
num=obj.nextInt();
for(i=2;i<=num/2;i++)
{
	if(i%2==0)
	{
	   flag=1;
          break;
	}
}
if(flag==0)
{
System.out.println("Number is Prime  :"+num);
}
else
{
System.out.println("Number is not Prime  :"+num);
}
}
}

