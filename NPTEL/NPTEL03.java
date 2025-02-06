//Write a Java program to print the multiplication table of a given number up to 5.
import java.util.*;
class NPTEL03 {
public static void main(String[] args)
{
	Scanner ot=new Scanner(System.in);
	int n,i;
	System.out.print("enter the number:");
	n=ot.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.print(n+"x"+i+"="+n*i);
		System.out.print("\n");
	}
}
}
