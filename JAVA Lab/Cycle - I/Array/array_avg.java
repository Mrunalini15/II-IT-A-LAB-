import java.util.*;
class array_avg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix");
        int n,i,s = 0;
        double avg = 0.0;
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements into the array");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        avg = s/n;
        System.out.println("Avergae of the array = "+avg);
    }
}