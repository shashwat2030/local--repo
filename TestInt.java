import java.util.*;
public class TestInt
{
	public static void chkInt()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Entered_Value");
        String  x =sc.nextLine();
try
{
/* if(Integer.parseInt(x))
{System.out.println("entered_value_is_integer:");}
else
{System.out.println("entered_value_is_not_Integer");
} The above approach is wrong because it will create incompatible errors
*/
Integer.parseInt(x);
}	
catch(NumberFormatException e)
{
	System.out.println("Please_Entered_Right_Format_Value");
}
}
public static void main(String[]args)
{
	chkInt();
}
}