class Student {
  public static void main(String[] args) {
    
    // garbage collection
    int a = 1;
    int b = 2;
    int c = 3;
    // int e = 5;

    // int d = a + b;
    int f = a - b;
    System.out.println(f);
  }
}

class College {
  Student student = new Student();
}