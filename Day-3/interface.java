// Define the interface
interface Animal {
    void makeSound(); // Abstract method
}

// Implement the interface in Dog class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Implement the interface in Cat class
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class to test the interface
public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating an object of Dog
        Animal myCat = new Cat(); // Creating an object of Cat

        myDog.makeSound();
        myCat.makeSound();
    }
}
