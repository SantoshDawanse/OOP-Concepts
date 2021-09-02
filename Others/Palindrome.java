package Others;

/**
 * A program to check whether a given number is palindrome
 */


class A {
  boolean checkPalindrome(int value) {

    int a = value;
    int b, sum = 0;
    while (a > 0) { //121>0 -> 12>0 -> 1>0
      b = a % 10;//b=121%10=1 -> b=12%10=2 -> b=1%10=1
      sum = (sum * 10) + b;//sum=1 -> sum = 1*10+2=12 -> 120+1=121
      a = a / 10;//a=121/10=12 -> a=12/10=1 -> 1/10=0
    }
    return value == sum;
  }
}
public class Palindrome {
  public static void main(String[] args) {
    A checkP = new A();
    boolean check = checkP.checkPalindrome(123241);
    System.out.println(check);
  } 
  
}
