import java.util.*;
class array_rev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix");
        int n,i;
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements into the array");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The elements of the array in reverse order are :-\n");
        for(i=n-1;i>=0;i--){
            System.out.print(a[i]+"\t");
        }
    }
}