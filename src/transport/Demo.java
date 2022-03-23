package transport;

public class Demo {

  void go() {
    Vehicle v1 = new Vehicle();
    v1.startEngine();

    Car c1 = new Car();
    c1.startEngine();
    c1.drive();

    Vehicle v2 = new Vehicle();
    v2.startEngine();

    Plane p1 = new Plane();
    p1.startEngine();
    p1.fly();

    Vehicle v3 = new Vehicle();
    v3.startEngine();

    Ship s1 = new Ship();
    s1.startEngine();
    s1.Sailing();
  }

  public static void main(String[] args) {
    new Demo().go();
  }
}
