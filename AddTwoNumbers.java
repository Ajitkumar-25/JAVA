import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int sum = AddTwoNumbers.add(num1, num2);
        System.out.println("Sum of two numbers: " + sum);

        int difference = new AddTwoNumbers().subtract(num1, num2);
        System.out.println("Difference of two numbers: " + difference);

        int product = new AddTwoNumbers().multiply(num1, num2);
        System.out.println("Product of two numbers: " + product);

        int max = new AddTwoNumbers().max(num1, num2);
        System.out.println("Maximum of two numbers: " + max);

        int min = new AddTwoNumbers().min(num1, num2);
        System.out.println("Minimum of two numbers: " + min);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

}