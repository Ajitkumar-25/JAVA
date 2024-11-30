public class conditionalStatement {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than a and b");
        }

        // ternary operator

        int num1 = 10;
        int num2 = 20;
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Largest number is: " + result);

        // switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
        }

    }
}
