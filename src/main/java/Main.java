import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to scientific calculator program");
        System.out.println("Press 1 to compute square root\nPress 2 to compute factorial\n" +
                "Press 3 to compute natural log\nPress 4 to compute power function\n" +
                "Press any other key to exit");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);

       // while(1)
        try {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Please enter a number on which you want to compute square root: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is " + new Main().squareRoot(number));

            } else if (choice == 2) {
                System.out.print("Please enter a number on which you want to compute Factorial: ");
                double number = scanner.nextDouble();
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

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public long factorial(double number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double logFunction(double number) {
        return Math.log(number);
    }

    public double powerFunction(double number1, double number2) {
        return Math.pow(number1, number2);
    }
}
