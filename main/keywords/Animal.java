package main.keywords;

/**
 * class taht models an animal and contains animal related data
 */
public class Animal {
    
    public static String kingdom = "Animalia";
    public final String species;
    private int age;
    // its ok for developers to change name
    public String name;


    public Animal(String species){
        this.species = species;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

/*
 * Access modifiers: changes the visivility of  variables and methods
 * Private - restrcts everything from outside the calss, completed encapsulated
 * Default - access in the package or subclases (in Java package = folder)
 * Protected - not visible outside package but visible on subclases
 * Public - accesible across entire application, no restricctions
 */

 /*
  * Non-access modifiers:
  * Static - related to OOP / global method / loading into memory / variables and methods belong to the class rather than an object
  * Final - related to a variable, it can't be changed
  * ...
  */
