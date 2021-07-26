import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Table1 extends Frame {
public Table1(){
setSize(600, 600);
GridLayout g = new GridLayout(0, 4);
setLayout(g);
    try {
FileInputStream fin = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\JavaLab_1206\\Demo\\Demo2.txt");
            Scanner sc = new Scanner(fin).useDelimiter(",");
            String[] arrayList;
            String a;
            while (sc.hasNextLine()){
                    a = sc.nextLine();
arrayList = a.split(",");
                    for (String i : arrayList) {
                    add(new Label(i));
                    }                   
            }
     } catch (Exception ex) {  }
    pack();
setVisible(true);
}
}
public class Table_9 {
public static void main(String[] args) {
          Table1 a = new Table1();
}
}
