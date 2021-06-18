class MultipleCatch {  
public static void main(String[] args) {  
int a[] = new int[5];
try{        
a[5]=60/0;    
 }    
 catch(ArithmeticException e)  {  
System.out.println("Arithmetic Exception occurs");  
 }    
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBounds Exception occurs");  
 }    
catch(Exception e)  {  
 System.out.println("Parent Exception occurs");  
}  
 }  
}  