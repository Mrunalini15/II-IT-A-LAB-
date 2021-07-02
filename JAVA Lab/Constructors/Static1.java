class Static1{  
static int c=0;
  
Static1(){  
c++;
System.out.println(c);  
}  
  
public static void main(String args[]){  

Static1 s1=new Static1();  
Static1 s2=new Static1();  
Static1 s3=new Static1();  
}  
}  