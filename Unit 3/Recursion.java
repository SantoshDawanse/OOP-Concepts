class Factorial {

  public int recursion(int val) {
    if (val == 1)
      return 1;
// 5 * recursion(4) .... => 5*4*3*2*recursion(1)
    int result = val * recursion(val - 1);
    return result;

    // int fact = 1;
    // for (int i = val; i > 0; i--) {
    //   fact *= i;
    // }
    
    // return fact;
  }

}

public class Recursion {
  public static void main(String[] args) {
    
    Factorial factorial = new Factorial();
    int result = factorial.recursion(5);
    System.out.println(result);
  }
}
