package method;

//Flyable.java
interface Flyable {
 void fly_obj();
}

//Spacecraft.java
class Spacecraft implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Spacecraft is flying in space.");
 }
}

//Airplane.java
class Airplane implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Airplane is flying in the sky.");
 }
}

//Helicopter.java
class Helicopter implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Helicopter is hovering and flying in the air.");
 }
}

//Main.java
public class Flyable{
 public static void main(String[] args) {
     Flyable spacecraft = new Spacecraft();
     Flyable airplane = new Airplane();
     Flyable helicopter = new Helicopter();

     spacecraft.fly_obj();
     airplane.fly_obj();
     helicopter.fly_obj();
 }
}
