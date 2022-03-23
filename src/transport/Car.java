package transport;

public class Car extends Vehicle {

  void drive() {
    System.out.println("Car driving.\n");
  }

  void startEngine() {
    System.out.println("Car engine started.");
    super.startEngine();
    System.out.println(getEngineIsStarted());
  }
}
