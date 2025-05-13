package lv.acodemy;

public class MyClass {
    public static void main(String[] args) {
        // sout -> shortcut
        System.out.println("Ja u Mami Programmist");

        // Your text is here (One-line comment)

        /*
        First line
        Second line
        third line
         */

        // byte 8-bit
        byte age =30;
        System.out.println(age);

        //Naming convention:
        //Camel Case: MyClass for classes ( Capital Camel Case)
        //Camel Case : currentYear for variables ( Lover Camel Case
        //short 16-bit
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;

        //int 32-bit
        int score = 9000;
        int population = 14440009;
        int result = (10 * 10) - 42;
        System.out.println(result);

        //long-64bit
        long starsInGalaxy = 100_000_000_000L; //100000000000L (boxing type)
        long bigNumber = 9090878543322388878L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        //float 32-bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI; //casting
        float discount = 25.5f;

        //double 64-bit
        double accountBalace = 999999.9999444494839;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;

        System.out.println(pi);
        System.out.println(piDouble);

        //char (symbol)
        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        // Unicode есть таблица уникода и у каждого символа есть свой unicode https://symbl.cc/en/unicode-table/
        // Одинареые ковычки
        char smiley = '\u263A';
        System.out.println(smiley);

        //boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 > 60); //false
        System.out.println(passed);

        //String  храним текст String обязательно с большой буквы
        String myFullName ="Aleksejs Kļeščenkovs"; //immutable- не изменяется никогда
        System.out.println(myFullName);





    }
}
