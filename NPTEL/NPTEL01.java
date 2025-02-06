//Write a Java program to check if a given integer is even or odd.
import java.util.*;
class NPTEL01 {
public static void main(String[] args)
{
	Scanner ot=new Scanner(System.in);
	int n;
	System.out.print("entre the number:");
	n=ot.nextInt();
	if(n%2==0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
}
