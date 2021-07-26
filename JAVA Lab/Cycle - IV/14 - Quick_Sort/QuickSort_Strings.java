import java.util.*;
public class QuickSort_Strings {

    String names[];
    int length;

    public static void main(String[] args) {
        QuickSort_Strings obj = new QuickSort_Strings();
        String str[] = {"ruhi", "preeti", "neha", "arizona", "honey", "diana", "sujana"};
        obj.sort(str);

        for (String i : str) {
            System.out.println(i);
            //System.out.print(" ");
        }
    }

    void sort(String ar[]) {
        if (ar == null || ar.length == 0) {
            return;
        }
        this.names = ar;
        this.length = ar.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchange_names(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchange_names(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}