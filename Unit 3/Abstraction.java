
abstract class Box {
  int length, breadth, height, volume;

  void getData() {
    length = 10;
    breadth = 5;
    height = 3;
  }

  void calculateVolume() {
    volume = length * breadth * height;

    System.out.println(volume);
  }
}

public class Abstraction extends Box {
  public static void main(String[] args) {
    Abstraction obj = new Abstraction();
    obj.getData();
    obj.calculateVolume();
  }
}
