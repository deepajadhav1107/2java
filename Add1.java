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

class Puppy extends Dog {
    void make() {
        System.out.println("Puppy barks");
    }
}

// Main class to run the program
public class Add1 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy(); // use Puppy instead of Dog

        // Inherited methods from Animal and Dog
        puppy.sound();
        puppy.bark();
        puppy.make(); // now this works
    }
}
