import java.util.*;   
class string_palin 
{  
   public static void main(String args[])  
   {  
      String s, s1 = "";
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      s = in.nextLine();   
      int l = s.length();   
      for ( int i = l - 1; i >= 0; i-- )  
         s1 = s1 + s.charAt(i);  
      if (s.equals(s1))  
         System.out.println("It is a palindrome :- ");  
      else  
         System.out.println("It isn't a palindrome:-");   
   }  
}  