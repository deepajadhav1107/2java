// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Puppy extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Dog extends Puppy {
    void make() {
        System.out.println(" Puppy barks");
    }
}

// Main class to run the program
public class Add1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Inherited method from Animal
        dog.sound();
        dog.bark();
        dog.make();
    }
}
