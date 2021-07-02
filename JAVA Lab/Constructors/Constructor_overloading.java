class Constructor_overloading{
String name;
String branch;
int roll;
Constructor_overloading(String n,int r){
name =n;
roll = r;
}
Constructor_overloading(String n,int r, String b){
name = n;
roll = r;
branch = b;
}
void display(){
System.out.println("Output:-");
System.out.println("Name :- "+name+"\nRoll No. :- "+roll+"\nBranch :- "+branch);
}
public static void main(String [] args){
Constructor_overloading c1 = new Constructor_overloading("Neha",167,"IT");
Constructor_overloading c2 = new Constructor_overloading("Sammy",189);
c1.display();
c2.display();
}
}