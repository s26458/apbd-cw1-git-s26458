import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] archive = new String[10];

        System.out.println("===== welcome to console calculator =====");

        while(true){
            System.out.println(" --- choose option ---");
            System.out.println(" 1. ADD");
            System.out.println(" 2. SUBTRACT");
            System.out.println(" 3. MULTIPLY");
            System.out.println(" 4. DIVIDE");
            System.out.println(" 5. HISTORY");
            System.out.println(" 6. CALCULATE AVERAGE");
            System.out.println(" 7. CALCULATE MAX");
            System.out.println(" 0. EXIT");

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
                case 5 -> print_archive(archive);
                case 6 -> average(archive);
                case 7 -> max(archive);
                case 8 -> min(archive);
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }


        }
    }

    private static String[] get_tab_input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter multiple numbers separated by spaces: ");
        String userEntry = s.nextLine();
        String[] tab = userEntry.split(" ");
        return tab;
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

    private static void substract(String [] archive){
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

    private static void average(String[] archive){
        String[] data_tab = get_tab_input();
        String data = "(";
        int sum = 0;
        for (int i = 0; i<data_tab.length; i++){
            String tmpS = data_tab[i];
            Double tmpD = Double.parseDouble(tmpS);
            sum += tmpD;
            data = data + tmpS;
            if(i < data_tab.length-1){
                data = data + " + ";
            }
            else {
                data = data + " ) / " + data_tab.length + " = ";
            }
        }
        sum = sum / data_tab.length;
        data = data + sum;
        print_and_save(data, archive);
    }

    private static void max(String[] archive){
        String[] data_tab = get_tab_input();
        double max = 0;
        String data = "MAX FROM (";
        for (int i = 0; i<data_tab.length; i++){
            String tmpS = data_tab[i];
            Double tmpD = Double.parseDouble(tmpS);
            data = data + tmpS;
            if(tmpD > max){
            max = tmpD;
            }
            if(i < data_tab.length-1){
                data = data + " , ";
            }
            else {
                data = data + " ) IS ";
            }
        }
        data = data + max;
        print_and_save(data, archive);
    }

    private static void min(String[] archive){
        String[] data_tab = get_tab_input();
        double min = 0;
        String data = "MIN FROM (";
        for (int i = 0; i<data_tab.length; i++){
            String tmpS = data_tab[i];
            Double tmpD = Double.parseDouble(tmpS);
            data = data + tmpS;
            if(tmpD < min){
                min = tmpD;
            }
            if(i < data_tab.length-1){
                data = data + " , ";
            }
            else {
                data = data + " ) IS ";
            }
        }
        data = data + min;
        print_and_save(data, archive);
    }

    private static void print_and_save(String data, String[] archive){
        System.out.println(data);
        for (int i = 0; i < archive.length; i++){
            if (archive[i] == null){
                archive[i] = data;
                break;
            }
        }
    }

    private static void print_archive(String[] archive){
        for (String data : archive){
            if (data != null){
                System.out.println(data);
            }
        }
    }
}