import java.util.*;
class BubbleSort_dec {  

static int  bubbleSort(int a[],int n) {    
int temp = 0,c=0;  
for(int i=0; i < n; i++){  
 for(int j=1; j < (n-i); j++){  
  if(a[j-1] < a[j]){   
  temp = a[j-1];  
  a[j-1] = a[j];  
 a[j] = temp;  
c++;
}//if
}//j loop
}//i loop
return c;
  }

public static void main(String[] args) {  
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the array:-");
 int n = sc.nextInt();
int i;
int []a = new int[n];
System.out.println("Enter the elements :-");
for(i=0;i<n;i++){
a[i] = sc.nextInt();
}
 System.out.println("Array Before Bubble Sort");  
 for(i=0; i < n; i++){  
  System.out.print(a[i] + " ");  
    }  
 System.out.println();  

int b =   bubbleSort(a,n);
                 
 System.out.println("Array After Bubble Sort");  
for(i=0; i < n; i++){  
  System.out.print(a[i] + " ");  
    }  
System.out.println();
System.out.println("The number of interchanges occurred  are:- "+b); 
        }  
}  