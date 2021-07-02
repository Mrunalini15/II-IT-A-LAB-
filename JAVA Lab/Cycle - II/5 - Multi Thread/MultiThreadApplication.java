import java.util.*;

class Even implements Runnable{
public int n;
public Even(int n){
this.n = n;
}
public void run(){
System.out.println("New Thread "+n+" is even and it's square is = "+n*n);
}
}

class Odd implements Runnable{
int n;
public Odd(int n){
this.n = n;
}
public void run(){
System.out.println("New Thread "+n+" is odd and it's cube is = "+(n*n*n));
}
}

class A extends Thread {
public void run() {
int num = 0;
    Random r = new Random();
    try {
        for (int i = 0; i< 5; i++)        {
num = r.nextInt(100);
System.out.println("Main Thread and Generated Number is " + num);
                if (num % 2 == 0){
                            Thread t1 = new Thread(new Even(num));
                            t1.start();
                            }
                else {
                            Thread t2 = new Thread(new Odd(num));
                            t2.start();
                            }
Thread.sleep(1000);
System.out.println("--------------------------------------");
                }
        }catch (Exception ex) {
System.out.println(ex.getMessage());
         }
}
}
public class MultiThreadApplication{
public static void main(String[] args) {
        A a = new A();
a.start();
}
}
