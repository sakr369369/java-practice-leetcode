package com.java.opps;

import java.util.Optional;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();  // Animal moving....
        Dog d = new Dog();
        d.move(); // Dog moving....

        Animal animal2 = new Dog();
        animal2.move();   // Dog moving....

      //  Dog d2 = new Animal(); // compile time error
  //       Dog d2 = (Dog) new Animal(); // compile successfulyy but throwing run tile error (class com.java.opps.Animal cannot be cast to class com.java.opps.Dog )
   //     d2.move();

        Dog d3 = (Dog) animal;  // compile successfulyy but throwing run tile error (class com.java.opps.Animal cannot be cast to class com.java.opps.Dog )
        d3.move();

    }
}





class Animal{
    public  void move(){
        System.out.println("Animal moving....");

    }
}


 class Dog extends  Animal{
     public  void move(){
         System.out.println("Dog moving....");

     }
}