package transport;

public class Plane extends Vehicle{

  void fly(){
    System.out.println("Plane is flying\n");
  }

  void startEngine(){
    System.out.println("Plane engine has started");
    super.startEngine();
    System.out.println(getEngineIsStarted());
  }

}
