import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();

        String name = "John";
        String surname = "JOhn";
        String surname2 = new String("John");
        System.out.println(name + "-" + surname);
        System.out.println(name == surname);
        System.out.println(name == surname2);

        if (name.equals(surname)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (name.equalsIgnoreCase(surname)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
