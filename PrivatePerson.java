/*Write a Java program to create a class called Person with private instance variables name, age. and country. 
 * Provide public getter and setter methods to access and modify these variables
 */

package method;

//Person class with private instance variables and public getter/setter methods
class Person {
 // Private instance variables
 private String name;
 private int age;
 private String country;

 // Constructor to initialize the object
 public Person(String name, int age, String country) {
     this.name = name;
     this.age = age;
     this.country = country;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method for age
 public int getAge() {
     return age;
 }

 // Setter method for age
 public void setAge(int age) {
     this.age = age;
 }

 // Getter method for country
 public String getCountry() {
     return country;
 }

 // Setter method for country
 public void setCountry(String country) {
     this.country = country;
 }

 // toString method to print the object's details
 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Country: " + country;
 }
}

class PersonDetails {
 public static void main(String[] args) {
     // Create a Person object
     Person person = new Person("John Doe", 30, "USA");

     // Print the person's details
     System.out.println("Initial Details:");
     System.out.println(person.toString());

     // Modify the person's details using setter methods
     person.setName("Jane Doe");
     person.setAge(25);
     person.setCountry("Canada");

     // Print the updated person's details
     System.out.println("\nUpdated Details:");
     System.out.println(person.toString());
 }
}