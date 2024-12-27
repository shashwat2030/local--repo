import java.util.*;
public class TestInt3
{
public static void chkInt3()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter_input:");
String s =sc.nextLine();
boolean flag =true;
for(int i =0;i<s.length();i++)
{
	if(i==0 && s.charAt(i)=='-')
	{
		continue;
	}
else if(!Character.isDigit(s.charAt(i)))
{ flag =false;
// if flag is false then that means that it is not an
// character
System.out.println("Its_character");
}
else if(flag)
{
System.out.println("it_is_an_integer");
}
}
}
public static void main(String[]args)
{
chkInt3();
}
}
