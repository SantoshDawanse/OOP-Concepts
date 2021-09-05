import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    // ram => is not palindrome
    // eye => is palindrome

    // tenet
    // string a = "tenet", b = ""
    // find length of a
    // use for loop
    // reverse a and add character to b
    // compare a and b
    // if true, palindrome otherwise not

    // String a = "tenet";
    String b = "";

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string to check for palindrome!!!");
    String a = scanner.nextLine();
    // length = 5; 
    for (int i = (a.length() - 1); i >= 0; --i) {
      b += Character.toString(a.charAt(i));
    }

    if (a.equals(b)) {
      System.out.println(a + " is a palindrome string.");
    } else {
      System.out.println(a + " is not a palindrome string.");
    }

  }
}
