import java.util.Scanner;
public class stringReverse
{
public static void main(String[] args)
{
System.out.println("PROGRAM TO REVERSE A STRING USING RECURSION");
System.out.println("ENTER THE STRING TO BE REVERSED USING RECURSION");
Scanner input = new Scanner(System.in);
String str = input.nextLine();
String reversed="";
System.out.println("THE REVERSED STRING IS: " +reverseString(str,"",0,str.length()-1) );
}
public static String reverseString(String str,String reversed,int startIndex,int endIndex)
 {
    if(startIndex>endIndex)
    {
    return reversed;
    }
     reversed +=str.charAt(endIndex);
    return reverseString(str,reversed,startIndex,endIndex-1);
    }

 }