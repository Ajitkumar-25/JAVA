public class loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int k : arr) {
            System.out.println(k);
        }

        // do while loop
        int l = 0;
        do {
            System.out.println(l);
            l++;
        } while (l < 5);

        // break statement
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                break;
            }
            System.out.println(m);
        }

        // continue statement
        for (int n = 0; n < 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);
        }

        // nested loop
        for (int o = 0; o < 3; o++) {
            for (int p = 0; p < 3; p++) {
                System.out.println(o + " " + p);
            }
        }
    }
}
