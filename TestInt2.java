import java.util.*;
public class TestInt2
{
public static void chkInt2()
{
Scanner sc = new Scanner(System.in);
System.out.println("Please_Enter_Value");
if(sc.hasNextInt())
{
System.out.println("Entered_Value_Is_An_Integer");
}
else 
{
System.out.println("It's_not_an_integer");
}
}
public static void main(String []args)
{
chkInt2();
}
}