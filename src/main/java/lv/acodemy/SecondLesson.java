package lv.acodemy;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        String name = "Aleksejs";
        String age = "33";

        //Array
        int[] numbers = new int[5];
        System.out.println( Arrays.toString(numbers));// [0,0,0,0,0]
        String [] names = {"Makar", "Aleksej", "Robert"} ;// [Makar ,Aleksej, Robert]
        //index: [0] - Makar
        //index: [1] - Aleksej
        //index: [2] - Robert

        int[] ages = {18, 34, 56, 78, 90};
        //index: [0] - 18
        //index: [1] - 34
        //index: [2] - 56
        //index: [3] - 78
        //index: [4] - 90
        String[] fruitBasket = new String[10];

        //Element access
        System.out.println(numbers[0]);
        numbers [0] = 10;
        numbers [1] = 144467;
        numbers [2] = 27;
        numbers [3] = 66;
        numbers [4] = 586;
        System.out.println(Arrays.toString(numbers));

        //Exercise заполнить корзину фруктами
        fruitBasket[0] = "Apple";
        fruitBasket[1] = "Banana";
        fruitBasket[2] = "Orange";
        fruitBasket[3] = "Grapes";
        fruitBasket[4] = "Peach";
        fruitBasket[5] = "Cherry";
        fruitBasket[6] = "Mango";
        fruitBasket[7] = "Pineapple";
        fruitBasket[8] = "Kiwi";
        fruitBasket[9] = "Strawberry";
        System.out.println(Arrays.toString(fruitBasket));

        //loops
        //print "hello world" 5 times
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("==========");


        //for loop
        for (int i=0; i<5; i++) {
            System.out.println("Hello World" + " index:" +i);
        }
        System.out.println("==========");

        for (int i =0; i<fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }
        System.out.println("==========");

        //for each
        for (String fruit : fruitBasket) {
            System.out.println(fruit);
        }
        System.out.println("==========");

        //for состоит из 1 счетчик 2 условия пока правда


        //создать массив с 0 до 10 и распесать в обратрном порядке
        //create int number array from 0 -> to 10;
        //Print in reverse order;
        int[] numbersReverse = new int[11];

        for (int i = 0; i < numbersReverse.length; i++) {
            numbersReverse[i] = i;
        }

        for (int i = numbersReverse.length - 1; i >= 0; i--) {
            System.out.println(numbersReverse[i]);}

        System.out.println("==========");

        int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
        for (int i=nums.length -1;  i>= 0 ; i--) {
            System.out.print(i + " ");
            // в ковычках чтобы писал через пробел когла печатаем
        }

        System.out.println("==========");
        System.out.println("==========");

        //concatenation
        String myName = "Aleksej";
        String mySurname ="Kleshchenkov";
        int myAge = 30;
        //My name is Aleksej Kleshchenkov. My age is 33 years old.
        System.out.println("My name is "+ myName+" " + mySurname + ". " + "My age is "+ myAge +"  "+ "years old.");
        //String.format();
        System.out .println(
                String.format("My name is %s %s. I am %d years old.", myName,mySurname, myAge));

        String template = """
                My name is %s %s. I am %d years old.""";
        System.out.println(String.format( template, myName, mySurname, myAge));
        // https://www.w3schools.com/java/ref_string_format.asp
        System.out.println("==========");


        //while loops
        /*
        while(condition) {
        //loop body
        }
         */

        int i = 0;
        while (i <= 5){
            System.out.println("Number: " + i);
            i++;
        }

        Scanner scaner = new Scanner(System.in);
        String password = "";

        /*

         */

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password=scaner.nextLine();
        }
        System.out.println("Access garanted!");

        System.out.println("==========");

        int guessedNumber = 10;
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != guessedNumber);
        System.out.println("Guessed");


        // задание : таблица умножения от 1 до 5
        int number = 5;

        for (int o = 1; o <= 10; o++) {
            System.out.println(number + " x " + o + " = " + (number * o));
        }
        // задание : сумма чисел от 1 до 100
        int summa = 0;
        for (int e = 1; e<= 100; e++) {
            summa= summa + e;
        }
        System.out.println("Summa:"+ summa);
        //вывести через while числа от 10 до 1
        int n = 10;

        while (n >= 1) {
            System.out.println(n);
            n--;
        }






    }
}
