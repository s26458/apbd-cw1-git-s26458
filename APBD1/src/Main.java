import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] archive = new String[10];

        System.out.println("==== welcome to console calculator ====");

        while(true){
            System.out.println(" --- choose option ---");
            System.out.println(" 1. ADD");
            System.out.println(" 2. SUBTRACT");
            System.out.println(" 3. MULTIPLY");
            System.out.println(" 4. DIVIDE");
            System.out.println(" 5. HISTORY");
            System.out.println(" 6. EXIT");

            Scanner s = new Scanner(System.in);
            int operation = s.nextInt();

            if (archive[archive.length-1] != null){
                String[] tmp = new  String[archive.length + 10];
                for (int i = 0; i < archive.length; i++){
                    tmp[i] = archive[i];
                }
                archive = tmp;
            }


            switch(operation){
                case 1 -> add(archive);
                case 2 -> substract(archive);
                case 3 -> multiply(archive);
                case 4 -> divide(archive);
                case 5 -> {
                    for (String data : archive) {
                        if (data != null) {
                            System.out.println(data);
                        }
                    }
                }
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }


        }
    }

    private static void substract(String[] archive) {
    }

    private static void add(String[] archive){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = s.nextInt();
        String data = (firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        print_and_save(data, archive);
    }
    private void subtract(String [] archive){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = s.nextInt();
        String data = (firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        print_and_save(data, archive);
    }
    private static void multiply(String[] archive){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = s.nextInt();
        String data = (firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        print_and_save(data, archive);
    }
    private static void divide(String[] archive){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = s.nextInt();
        String data = (firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        print_and_save(data, archive);
    }
    private static void print_and_save(String data, String[] archive){
        System.out.println(data);
        for (int i = 0; i < archive.length; i++){
            System.out.println(archive[i]);
            if (archive[i] == null){
                archive[i] = data;
                break;
            }
        }
    }
}