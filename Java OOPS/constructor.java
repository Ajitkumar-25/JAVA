public class constructor {
    public static void main(String[] args) {
        complex c1 = new complex();
        System.out.println("Real: " + c1.real + " Imaginary: " + c1.imaginary);
        complex c2 = new complex(5, 6);
        System.out.println("Real: " + c2.real + " Imaginary: " + c2.imaginary);
    }
}

class complex {
    int real, imaginary;

    complex() {
        real = 0;
        imaginary = 0;
    }

    complex(int r, int i) {
        real = r;
        imaginary = i;
    }

}
