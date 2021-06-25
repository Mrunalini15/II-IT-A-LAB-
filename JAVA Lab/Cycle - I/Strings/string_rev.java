import java.util.*;   
class string_rev 
{  
   public static void main(String args[])  
   {  
      String s, s1 = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string:-");  
      s= in.nextLine();   
      int l= s.length();   
      for ( int i = l - 1; i >= 0; i-- )  
         s1 = s1 + s.charAt(i);  
      System.out.println("Reverse of a string :- "+s1);  
   }  
}  