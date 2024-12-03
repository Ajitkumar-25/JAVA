public class overloading {
    public static void main(String[] args) {
        test obj = new test();
        obj.welcome();
        obj.welcome("John");
        obj.welcome("John", 25);

    }
}

class test {
    void welcome() {
        System.out.println("Welcome to the world of Java");
    }

    void welcome(String name) {
        System.out.println("Welcome " + name + " to the world of Java");
    }

    void welcome(String name, int age) {
        System.out.println("Welcome " + name + " to the world of Java");
        System.out.println("Your age is " + age);
    }
}
