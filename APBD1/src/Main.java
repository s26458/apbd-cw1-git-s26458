import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== welcome to console calculator ====");

        while(true){
            System.out.println(" --- choose option ---");
            System.out.println(" 1. ADD");
            System.out.println(" 2. SUBTRACT");
            System.out.println(" 3. MULTIPLY");
            System.out.println(" 4. DIVIDE");
            System.out.println(" 5. EXIT");

            Scanner s = new Scanner(System.in);
            int operation = s.nextInt();

            System.out.print("Please enter the first number: ");
            int firstNumber = s.nextInt();
            System.out.print("Please enter the second number: ");
            int secondNumber = s.nextInt();

            switch(operation){
                case 1 -> System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                case 2 -> System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                case 3 -> System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                case 4 -> System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                case 5 -> System.exit(0);
            }
        }
    }
}