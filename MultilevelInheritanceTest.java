package method;

//Multilevel Inheritance Example

//Superclass
class Doctor {
 String name;

 void cardiology() {
     System.out.println(name + " is cardiology a patient.");
 }
}

//Subclass of Doctor
class Surgeon extends Doctor {
 void performSurgery() {
     System.out.println(name + " is performing surgery.");
 }
}

//Subclass of Surgeon
class SpecialistSurgeon extends Surgeon {
 void performSpecialSurgery() {
     System.out.println(name + " is performing specialized surgery.");
 }
}

public class MultilevelInheritanceTest {
 public static void main(String[] args) {
     SpecialistSurgeon specialistSurgeon = new SpecialistSurgeon();
     specialistSurgeon.name = "Dr. Fatima";
     specialistSurgeon.cardilogy(); // Inherited from Doctor
     specialistSurgeon.performSurgery(); // Inherited from Surgeon
     specialistSurgeon.performSpecialSurgery(); // Method of SpecialistSurgeon
 }
}


//ouput:
/*
Dr. Farima is cardiology a patient.
Dr. Fatima is performing surgery.
Dr. Fatima is performing specialized surgery.
*/