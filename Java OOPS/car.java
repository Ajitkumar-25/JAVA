public class car extends vehicle {
    int doors;

    void display() {
        System.out.println("Wheels: " + wheels + " Color: " + color + " Doors: " + doors);
    }

    public static void main(String[] args) {
        car c = new car();
        c.wheels = 4;
        c.color = "Red";
        c.doors = 4;
        c.display();
        c.start();
    }

}
