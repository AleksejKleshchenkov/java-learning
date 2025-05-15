package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {
        //Conditional operators in Java
        //if если условия выпорнлняются мы что-то делаем  название переменной лучше всего начинать с if или has
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if (temperature > 29) {
            System.out.println("It is too hot!");
        }
        //And оба условия выполняются
        if (4>2 && 10>1 && 34<67) {
            System.out.println("Both are aquals! ");
        }
        // одно из условий выполняется
        if (4>2 || 10>11 || 34<67) {
            System.out.println("Execute are aquals! ");
        }

        // if/else
        boolean isWeekDay = false;
        if (isWeekDay) {
            System.out.println("i going to wokr!");
        } else {
            System.out.println("it is my day off");}

        System.out.println("================================");

        int number =9;
        //%-
        //+ - / *
        if (number %2 ==0) {
            System.out.println("Evem number");
        } else {
            System.out.println("Odd number");}

        //if age =>18 --> Accese garanted
        // if age < 18 -->Accese denied
        int age =13;
        if (age> 18) {
            System.out.println("Accese garanted");
        } else {
            System.out.println("Accese denied");}

        //if-else-if-else
        int haurs = 8;
        if (haurs ==5) {
            System.out.println("Will go to run");
        } else if (haurs == 7) {
            System.out.println("breakfest");
        } else if (haurs==9) {
            System.out.println("Start to work");
        }else {
            System.out.println("Free time");}

        // score >=90 -perfect
        // >=70 - good
        // >= 50 -okeeey
        // else - NOT OKEY

        int score = 90;

        if (score >= 90) {
            System.out.println("perfect");
        } else if (score >= 70) {
            System.out.println("good");
        } else if (score >= 50) {
            System.out.println("okeeey");
        } else {
            System.out.println("NOT OKEY");
        }

        // age -> 0-6 =baby
        // 7-17 = Shkilla
        // 17-65 = adult
        // 65+ = pens

        int ages = 30;

        if (ages >= 0 && ages <= 6) {
            System.out.println("baby");
        } else if (ages >= 7 && ages <= 17) {
            System.out.println("Shkilla");
        } else if (ages > 17 && ages < 65) {
            System.out.println("adult");
        } else if (ages >= 65) {
            System.out.println("pens");}

        // We know conditions & loops
        //print even numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Number: "+i+ " is even number");}
        }

        int[]numbers = {-2,-10,5,6,-100, 3, 0, 20};
        int sum = 0;
        // Count only for numbers that is positive
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];}}
            System.out.println("Сумма положительных чисел: " + sum);

        //1 till 20
        //print numbers that can be divided by 3 and 5 (число делится и на 3 и на 5)
        // print divided by 3 (число делится на 3)
        // print divided by 5 (число делится на 5)
        // else -> just print numbers ( НЕ делится на 3 и 5)

        for (int n = 1; n <= 20; n++) {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(n + " делится и на 3 и на 5");
             else if (n % 3 == 0)
                System.out.println(n + " делится на 3");
             else if (n % 5 == 0)
                System.out.println(n + " делится на 5");
             else
                System.out.println(n);

        }















    }
}
