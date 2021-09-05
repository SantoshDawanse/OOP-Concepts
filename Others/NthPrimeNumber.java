package Others;

class PrimeNumber {

  public boolean isPrime(int value) {
    int flag=0;
    
    for (int i = 2; i <= value / 2; i++) {
      if (value != 2 && value % 2 == 0) {
        flag = 1;
        break;
      }
      if (value % i == 0) {
        flag = 1;
        break;
      }
    }

    return flag == 0;
  }
}

public class NthPrimeNumber {
  public static void main(String[] args) {

    PrimeNumber primeNumber = new PrimeNumber();

    int nth = 5, a = 0, i=2;
    for (i = 2; a <= nth; i++) {
      if (primeNumber.isPrime(i)) {
        a++;
      }

      if (a == nth) {
        break;
      }

    }

    System.out.println(i);

  }
}
