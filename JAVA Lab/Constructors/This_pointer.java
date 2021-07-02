class This_pointer{  
int a;
int b;
int area =0;

This_pointer(int a,int b){  
this.a = a;  
this.b = b;
}  

void display(){
area = a*b;
System.out.println("Area = "+area);
}  

public static void main(String[] args){  
This_pointer t1=new This_pointer(6,5);  
This_pointer t2=new This_pointer(8,5);  
t1.display();  
t2.display();  
}
}