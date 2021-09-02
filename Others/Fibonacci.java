package Others;

class PrintFibonacci {
  public void printF(int value) {
    int a=10;
  }
}

public class Fibonacci {
  public static void main(String[] args) {
    int a = 0, b = 1, c = 0, count = 10, i=2;
    do {
      c = a + b;
      a = b;
      b = c;
      i++;
      if (i == count) {
        System.out.print(" "+ c);
      }
    } while (i < count);
  }
}
