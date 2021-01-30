package fundamentals;

import java.util.Scanner;

public class TaskExercises {
    // Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //  Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    static float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;

    public static void perimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter");

        float diameter = scanner.nextFloat();

        System.out.println("The perimeter has the following length :" + diameter * pi);

    }

    // Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    // Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:

    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your height in cm, e.g. 170");
        int height = scanner.nextInt();
        System.out.println("Insert your weight in kg , e.g. 86.5 ");
        float weight = scanner.nextFloat();
        float bmi = weight / ((float) height / 100 * (float) height / 100);
        if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println( bmi + " \nBMI is optimal ");

        } else
            System.out.println( bmi + " \nBMI not optimal ");
    }

    //Write an application that takes a positive number from the user (type int) and writes all numbers from 1 to the given number, each on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int numar = scanner.nextInt();
        for (int i = 1; i <= numar; i++) {
            if ((i % 3) == 0 && (i % 7) == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);

            }
        }
    }
    //Write an application that takes a positive number from the user (type int)
    // and prints all prime numbers greater than 1 and less than the given number.
            public static void AllPrimeNumbers(){
                int i =0;
                int num =0;
                String  primeNumbers = "";
                for (i = 1; i <= 100; i++) {
                    int counter=0;
                    for(num =i; num>=1; num--) {
                        if(i%num==0) {
                            counter = counter + 1;
                        }
                    }
                    if (counter ==2) {
                        primeNumbers = primeNumbers + i + " ";
                    }
                }
                System.out.println("Prime numbers from 1 to 100 are :");
                System.out.println(primeNumbers);
    }

    }







