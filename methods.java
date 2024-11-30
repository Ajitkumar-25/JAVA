public class methods {
    public static void main(String[] args) {
        printName();
        System.out.println(average(5, 10));
    }

    static void printName() {
        System.out.println("Hello, my name is John Doe");
    }

    static int average(int a, int b) {
        return (a + b) / 2;
    }
}
