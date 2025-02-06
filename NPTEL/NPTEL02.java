//Write a Java program to calculate the volume of a cylinder given its radius and height.
import java.util.*;
class NPTEL02 {
public static void main(String[] args)
{
	Scanner ot=new Scanner(System.in);
	double r,h,v;
	System.out.print("enter the radius number:");
	r=ot.nextDouble();
	System.out.print("enter the height number:");
	h=ot.nextDouble();
	v=Math.PI*(r*r)*h;
	System.out.print("the result is:"+v);
}
}
