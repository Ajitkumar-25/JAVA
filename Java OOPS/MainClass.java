public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.age = 5;
        dog1.breed = "German Shephard";
        dog1.color = "Brown";
        dog1.size = "Large";

        dog1.bark();
        dog1.eat();
        dog1.printDogInfo();

        Cat cat1 = new Cat();
        cat1.name = "Kitty";
        cat1.age = 2;
        cat1.breed = "Persian";
        cat1.color = "White";
        cat1.size = "Small";

        cat1.meow();
        cat1.eat();
        cat1.printCatInfo();


    }
    
}


class Dog{
    String name;
    int age;
    String breed;
    String color;
    String size;

    void bark(){
        System.out.println("Barking");
    }

    void eat(){
        System.out.println("Dog Eating");
    }

    void printDogInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }
}

class Cat{
    String name;
    int age;
    String breed;
    String color;
    String size;

    void meow(){
        System.out.println("Meowing");
    }

    void eat(){
        System.out.println("Cat Eating");
    }

    void printCatInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }
}
