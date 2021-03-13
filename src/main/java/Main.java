import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.*;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Welcome to scientific calculator program");
        System.out.println("Press 1 to compute square root\nPress 2 to compute factorial\n" +
                "Press 3 to compute natural log\nPress 4 to compute power function\n" +
                "Press any other key to exit");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);


        try {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Please enter a number on which you want to compute square root: ");
                double number = scanner.nextDouble();
                //int num=(int) number;
                System.out.println("Your result is " + new Main().squareRoot(number));

            } else if (choice == 2) {
                System.out.print("Please enter a number on which you want to compute Factorial: ");
                int number = scanner.nextInt();
                System.out.println("Factorial of " + number + " is: " + new Main().factorial(number));
            } else if (choice == 3) {
                System.out.print("Please enter a number on which you want to compute Natural log: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is " + new Main().logFunction(number));
            } else if (choice == 4) {
                System.out.print("Please enter a number on which you want to compute Power Function: ");
                double number1 = scanner.nextDouble();
                double number2 = scanner.nextDouble();
                System.out.println("Your result is " + new Main().powerFunction(number1, number2));

            }

        } catch (Exception e) {
            System.out.println("Exiting.....");
        }


    }

    public static int factorial(int num1) {
        logger.info("[Factorial], number " + num1);
        int result = 1;
        if (num1 == 0 || num1 == 1)
            return 1;
        for (int i = num1; i >= 1; i--) {
            result = result * i;
        }
        logger.info("[Result-Factorial], number " + num1 + " is " + result);
        return result;
    }


    public static double squareRoot(double num) {
        //temporary variable
        logger.info("[Square-Root], number " + num);
        if (num == 0)
            return 0;
        if (num < 0)
            return -1;
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        logger.info("[Result-Square-Root], number " + num + " is " + sqrtroot);
        return sqrtroot;
    }


    public static double logFunction(double num) {
        logger.info("[Natural-Log], number " + num);
        logger.info("[Result-Natural-Log], number " + num + " is " + log(num));
        return log(num);
    }

    public static double powerFunction(double x, double y) {
        logger.info("[Power], number " + x + "," + y);
        logger.info("[Result-Power], number " + x + "," + y + " is " + pow(x, y));
        return pow(x, y);

    }
}