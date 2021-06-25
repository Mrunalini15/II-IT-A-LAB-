import java.util.*;
class array_asc {    
    public static void main(String[] args) {        
            
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array: - ");
        int n = sc.nextInt();
        int [] a = new int [n];     
        int temp = 0,i,j;    
        for(i=0;i<n;i++){
	a[i] = sc.nextInt();
}

        System.out.println("Elements of original array: ");    
        for (i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
            
        for (i = 0; i < n; i++) {     
            for (j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
          
        System.out.println("Elements of array sorted in ascending order: ");    
        for (i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}   