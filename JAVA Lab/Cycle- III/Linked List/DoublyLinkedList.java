public class DoublyLinkedList{
class Node{
int data;
Node pre;
Node next;
Node(int data){
this.data = data;
}//node
}//class node

Node head,tail = null;

void addNode(int data){
Node newNode  = new Node(data);
if(head == null){
head = tail = newNode;
head.pre = null;
tail.next = null;
}//if
else{
tail.next = newNode;
newNode.pre = tail;
tail = newNode;
tail.next = null;
}//else
}//addNode 

void delete(int data) {
    Node current = head;
    while (current != null && current.data != data) {
        current = current.next;
    }
System.out.println("After deletion :- ");
    deleteNode(current);
 }//delete

private void deleteNode(Node node) {
    if (node != null) {
        if (node.pre != null)
            node.pre.next = node.next;
        else
            head = node.next;
        if (node.next != null)
            node.next.pre = node.pre;
        else
            tail = node.pre;
    }
}//void delete

void display(){
Node current = head;
if(head == null){
System.out.println("List is empty");
return;
}//if
System.out.println("Elements of doubly linked list :-");
while(current != null){
System.out.print(current.data + " ");
current = current.next;
}//while
System.out.println();
}//display

public static void main(String[] args){
DoublyLinkedList ob = new DoublyLinkedList();
ob.addNode(1);
ob.addNode(2);
ob.addNode(3);
ob.addNode(6);
ob.addNode(4);
ob.addNode(5);
ob.display();
ob.delete(6);
ob.display();
}//main
}//list