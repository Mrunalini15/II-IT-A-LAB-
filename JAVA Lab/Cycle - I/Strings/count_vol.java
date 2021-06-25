import java.util.*;
import java.lang.*;
class count_vol{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.next();
int c = 0,v=0,i;
s = s.toLowerCase();
for(i=0;i<s.length();i++){
if(s.charAt(i) == 'a' || s.charAt(i)  =='e' || s.charAt(i)  == 'i' || s.charAt(i)  == 'o' || s.charAt(i)  == 'u' )
v++;
else
c++;
}
System.out.println("Number of vowels in the string are "+v);
System.out.println("Number of consonants in the string are "+c);

            }
        }