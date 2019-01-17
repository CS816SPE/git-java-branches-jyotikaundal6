import java.util.Scanner;
class calculator
{
public static void main(String []args)
{
  int a,b;
  char operation;
 Scanner in = new Scanner(System.in);
 a = in.nextInt();
 b = in.nextInt();
 operation = in.next().charAt(0);
 switch(operation)
 {
	 case '+': System.out.println("The sum is "+(a+b));
	          break;
	 case '-': System.out.println("The difference is "+(a-b));
		  break;
	 default: System.out.println("Invalid operation");	   
 }
  

}

}
