/**
 * 
 * Design Pattern : Singleton Pattern [creational pattern]
 * Author      : Almgwary
 * Date        : 28-Mar-2016
 * Thin        : --M
 **/


// This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
// Implementation
// We're going to create a SingleObject class. SingleObject class have its constructor as private and have a static instance of itself.
// SingleObject class provides a static method to get its static instance to outside world. SingletonPatternDemo, our demo class will use SingleObject class to get a SingleObject object.
// Singleton Pattern UML Diagram
// Step 1
// Create a Singleton Class.
// SingleObject.java
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
// Step 2
// Get the only object from the singleton class.
// SingletonPatternDemo.java
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
   }
}