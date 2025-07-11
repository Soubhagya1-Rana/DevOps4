class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    public final void speak() {  // subtle change here
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        // a.fetch(); // Compile-time error: fetch() is not in Animal
        System.out.println("New Build");
    }
}
