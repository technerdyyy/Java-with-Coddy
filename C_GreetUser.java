// Write a function named greet that gets a name as input and prints Hello, name .
// Example :
// greet("Bob")  ->  "Hello, Bob"

class Greet {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class C_GreetUser {
    public static void main(String[] args) {
        Greet.greet("Bob");
    }
}
