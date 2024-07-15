package practice;

public class OOP {
    // Attributes of the OOP class
    String modelYear;
    String modelName;

    public OOP() {
        modelYear = "2020";
    }

    public OOP(String modelYear) {
        this.modelYear = modelYear;
    }

    public OOP(String modelName, String modelYear) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    // A new class - Cat
    static class Cat {
        String name;
        void meow() {
            System.out.println(name + ": Meow!!!");
        }
    }

    public static void main(String[] args) {
        // Classes - Cat
        Cat cat = new Cat();
        cat.name = "Sam";
        cat.meow(); // Sam: Meow!!!

        // Class - OOP
        OOP oop = new OOP();
        System.out.println(oop.modelYear); // 2020

        OOP oop2 = new OOP("2024");
        System.out.println(oop2.modelYear); // 2024
        System.out.println(oop2.modelName); // null

        OOP oop3 = new OOP("Ford", "2024");
        System.out.println(oop3.modelName); // Ford
        System.out.println(oop3.modelYear); // 2024
    }
}
