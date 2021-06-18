class try1 {
  public static void main(String[ ] args) {
    int []a = {1, 2, 3,4};
    try {
      System.out.println(a[10]);
    } catch (Exception e) {
      System.out.println("Array index value doesn't exit");
    }
  }
}