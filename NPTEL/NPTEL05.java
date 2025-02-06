//Write a program which will print a pattern of "*" 's of height "n".
import java.util.*;
class NPTEL05 {
public static void main(String[] args)
{
	Scanner ot=new Scanner(System.in);
	int n,i,j;
	System.out.print("enter the number:");
	n=ot.nextInt();
	for(i=n;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	for(i=2;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
}
