////Write a Java Program to add two numbers by declaring variables value.
import java.util.*;
class basic1
{
	public static void main(String[] args)
	{
		Scanner ot=new Scanner(System.in);
		int a,b,sum=0;
		System.out.print("enter the first number:");
		a=ot.nextInt();
		System.out.print("enter the second number:");
		b=ot.nextInt();
		sum=a+b;
		System.out.print("the sum is:"+sum);
	}
}