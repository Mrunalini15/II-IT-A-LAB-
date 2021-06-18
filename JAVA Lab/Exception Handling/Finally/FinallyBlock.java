class FinallyBlock{  
  public static void main(String args[]){  
int d ;
  try{  
   d=25/0;  
   System.out.println(d);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");} 
  }  
}  