import java.util.*;
class array_sum{
    static int find(int a1[],int n1){
        int i,s=0;
        for(i=0;i<n1;i++)
            s = s + a1[i];
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix");
        int n,i,s;
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements into the array");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        s = find(a,n);
        System.out.println("The elements in the array are :-");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("Sum = "+s);
    }
}