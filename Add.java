// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class Add {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Inherited method from Animal
        dog.sound();

        // Method from Dog class
        dog.bark();
    }
}
