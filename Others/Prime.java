package Others;

public class Prime {
  public static void main(String[] args) {
    int a = 11, flag=0;
    
    for (int i = 2; i <= a / 2; i++) {
      if(a != 2 && a%2 == 0) {
        System.out.println(a + " is not a prime number.");
        flag = 1;
        break;
      }
      if (a % i == 0) {
        System.out.println(a + " is not a prime number.");
        flag = 1;
        break;
      }
    }
    
    if (flag == 0) {
      System.out.println(a + " is a prime number.");
    }
    
  }
}
