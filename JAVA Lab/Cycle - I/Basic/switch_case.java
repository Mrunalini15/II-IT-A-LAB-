import java.util.*;
class switch_case{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("\t\tCalculator\t\t");
System.out.println("Enter two numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Enter '+' for Addition \n'-' for Subtraction \n'*' for Multiplication \n'/' for Division \n Enter your choice:- ");
char ch = sc.next().charAt(0);
int result = 0;
switch(ch){
        case '+' :
            result = a+b;
        break;
        case '-' :
            if(a>b)
                result = a-b;
            else
                result = b-a;
        break;
        case '*' :
            result = a*b;
        break;
        case '/' :
            if(a>b)
                result = a/b;
            else
                result = b/a;
        break;
    }
 System.out.println("The answer = "+result);
}
}



