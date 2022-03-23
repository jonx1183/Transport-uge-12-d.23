package transport;

public class Ship extends Vehicle{

  void Sailing(){
    System.out.println("The ship is saling");
  }

  void startEngine(){
    System.out.println("The ships engine has started");
    super.startEngine();
    System.out.println(getEngineIsStarted());

  }
}
