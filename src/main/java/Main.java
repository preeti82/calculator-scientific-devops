import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to scientific calculator program");
        System.out.println("Press 1 to compute square root\n, Press 2 to compute factorial\n, Press 3 to compute natural log\n, Press 4 to compute power function\n, Press any other key to exit");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Please enter a number on which you want to compute square root: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is " + Math.sqrt(number));

            } else if (choice == 2) {
               long fact=1;
                System.out.print("Please enter a number on which you want to compute Factorial: ");
                double number = scanner.nextDouble();
                for (int i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + number + " is: " + fact);
            }
            else if(choice==3){
                System.out.print("Please enter a number on which you want to compute Natural log: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is "+ Math.log(number));
            }
            else if(choice==4){
                System.out.print("Please enter a number on which you want to compute Power Function: ");
                double number1 = scanner.nextDouble();
                double number2 = scanner.nextDouble();
                System.out.println("Your result is "+ Math.pow(number1,number2));

            }
        }catch (Exception e){
            System.out.println("Exiting.....");
        }
    }
}
