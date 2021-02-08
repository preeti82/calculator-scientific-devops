import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to scientific calculator program");
        System.out.println("Press 1 to compute square root, Press 2 to compute factorial, Press 3 to compute natural log, Press 4 to compute power function, Press any other key to exit");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.print("Please enter a number on which you want to compute square root: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is "+ Math.sqrt(number));

            }
            else if(choice==3){
                System.out.print("Please enter a number on which you want to compute Natural log: ");
                double number = scanner.nextDouble();
                System.out.println("Your result is "+ Math.log(number));

            }
        }catch (Exception e){
            System.out.println("Exiting.....");
        }
    }
}
