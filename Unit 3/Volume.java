
class Rectangle {
  private int length, breadth, height;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  
  Rectangle(int length, int breadth, int height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public int calculateVolume() {
    return length * breadth * height;
  }

  public int alculateArea() {
    return length * breadth;
  }
}


public class Volume {
  public static void main(String[] args) {
    Rectangle box = new Rectangle(3,4,5);
    int volume = box.calculateVolume();
    System.out.println(volume);
  }
}
