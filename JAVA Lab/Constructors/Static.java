class Static{  
     int roll;  
     String name;  
     static String branch = "CSE";  

     static void change(){  
     branch = "IT";  
     }  
     
     Static(String n, int r){  
     roll = r;   
     name = n;  
     }  
     
     void display(){
System.out.println("Output:-");
System.out.println("Name : - "+name+"\nRoll No. :- "+roll+"\nBranch :- "+branch);
}  
    public static void main(String [] args){  
    Static.change();

    Static s1 = new Static("Karan",123);  
    Static s2 = new Static("Aryan",124);  
  
    s1.display();  
    s2.display();    
    }
}  