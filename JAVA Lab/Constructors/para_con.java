class para_con{
String name;
int roll;
para_con(String s,int r){
name =s;
roll = r;
}
void display(){
System.out.println("Output:- ");
System.out.println("Name :- "+name+"\nRoll No. : - "+roll);
}
public static void main(String [] args){
para_con p1 = new para_con("Honey",154);
para_con p2 = new para_con("Ruhi",123);
p1.display();
p2.display();

}
}