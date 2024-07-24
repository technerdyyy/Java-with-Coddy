class Greet {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class GreetUser{
    public static void main(String[] args){
        Greet.greet("Bob");
    }
}

