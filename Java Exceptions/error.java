
// public class error {
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         System.out.println("Before Exception");
//         try {
//             System.out.println(10 / 0);
//             System.out.println(arr[10]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array Index is Out of Bound");
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception");
//         }
//         System.out.println("After Exception");
//     }
// }

// public class error {
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         System.out.println("Before Exception");
//         try {
//             System.out.println(10 / 0);
//             System.out.println(arr[10]);
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//         System.out.println("After Exception");
//     }
// }

public class error {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Before Exception");
        try {
            System.out.println(10 / 0);
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block");
            
        }
        System.out.println("After Exception");

        try {
            getNumber(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out of Bound");
        }

        try {
            getNumber(arr, 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out of Bounds");
        }
    }

    static int getNumber(int arr[]) throws ArrayIndexOutOfBoundsException {
        return arr[8];
    }

    static int getNumber(int arr[], int index) {
        throw new ArrayIndexOutOfBoundsException();
    }
}