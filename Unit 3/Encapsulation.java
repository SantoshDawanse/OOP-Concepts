class Test {
  private String name;
  private int age;

  // getter and setter
  public String getName() {
    return name;
  }

  public void setName(String value) {
    name = value;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int value) {
    age = value;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Test test = new Test();
    test.setName("Ronaldo");
    test.setAge(20);
    String name = test.getName(); //Ronaldo
    System.out.println(test.getAge());

    int a = drive(5);
  }

  int drive(int val) {
    return val + 5;
  }
}
