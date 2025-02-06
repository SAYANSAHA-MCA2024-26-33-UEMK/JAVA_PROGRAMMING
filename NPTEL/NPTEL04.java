//Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.
import java.util.*;
class NPTEL04 {
public static void main(String[] args)
{
	Scanner ot=new Scanner(System.in);
	int x,y,quotient,remainder;
	System.out.print("enter the first number:");
	x=ot.nextInt();
	System.out.print("enter the second number:");
	y=ot.nextInt();
	quotient=x/y;
	remainder=x%y;
	System.out.print("the quotient is:"+quotient);
	System.out.print("\nthe remainder is:"+remainder);
}
}
