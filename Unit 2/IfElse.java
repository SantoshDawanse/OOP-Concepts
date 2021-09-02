public class IfElse {
  public static void main(String[] args) {
    // String A, B, C, D;
    // int A = 80;
    // int B = 60;
    // int C = 50;
    // int marks = 60;
    // int pass = 30;
    // if (marks > pass) {
    //   if (marks >= A) {
    //     System.out.println("Distinction");
    //   }else if(marks >= B) {
    //     System.out.println("Excellent");
    //   }else if(marks >= C) {
    //     System.out.println("Good");
    //   } else {
    //     System.out.println("Pass");
    //   }
    // } else {
    //   System.out.println("Fail");
    // }

    // if
    /**
     * if(expression) {
     *  ...
     * }
     */

    // switch 
    /**
     * switch(value) {
     *  case value:
     *    ...
     *    break;
     *  case value:
     *    ...
     *  default:
     *    ...
     * }
     */
    int marks = 60;
    int pass = 30;
    int A = 80;
    String message = marks > pass ? marks >= A ? "A": "B" : "F";
    switch (message) {
      case "A":
        System.out.println("Distinction");
        break;
      case "B":
        System.out.println("Excellent");
        break;
      case "C":
        System.out.println("Good");
        break;
      default:
        System.out.println("Fail");
     }

  }
}
