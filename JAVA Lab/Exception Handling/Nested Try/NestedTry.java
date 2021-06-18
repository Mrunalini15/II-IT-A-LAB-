class NestedTry{  
 public static void main(String args[]){  
int a[]=new int[5]; 
int b;
 try{  
    try{  
     System.out.println("Division : -");  
     b =56/0;  
    }
catch(ArithmeticException e){System.out.println(e);
}  
    try{  
    a[5]=4;  
    }
catch(ArrayIndexOutOfBoundsException e){System.out.println(e);
 }  
  }
catch(Exception e){System.out.println("handeled");
}
 }  //main
} //class 