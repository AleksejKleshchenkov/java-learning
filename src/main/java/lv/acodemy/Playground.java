package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();

        //Encapsulation
        rex.setName("Rex");
        rex.setAge(1);

        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getBreedName());


        Dog barsik = new Dog ("Alabai");
        barsik.setName("Barsik");
        barsik.setAge(4);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // распечатать breedName  через метод
        System.out.println(barsik.getBreedName());

        Dog karat = new Dog("retriver");
        karat.setName("Karat");
        karat.setAge(9);
        System.out.println(karat.getName());
        System.out.println(karat.getAge());
        System.out.println(karat.getBreedName());


        //All argument constructor
        Dog sobaka = new Dog("sobaka",1,"dvorovaja");
        System.out.println(sobaka);

        Car bemewe = new Car("M340");
        System.out.println(bemewe);
        bemewe.drive();
        System.out.println(bemewe);
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        bemewe.drive();
        System.out.println(bemewe);
        bemewe.refuel();
        System.out.println(bemewe);
        bemewe.service();









    }






}
