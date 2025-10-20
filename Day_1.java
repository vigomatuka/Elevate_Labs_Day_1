import java.util.Scanner;
public class Day_1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double  first, second;
        char operator;
        char answer;
        do{
            System.out.print("First number: ");
            first = scanner.nextDouble();
            System.out.print("Operator: ");
            operator = scanner.next().charAt(0);
            System.out.print("Second number: ");
            second = scanner.nextDouble();
            switch(operator){
                case '+': System.out.println("Result: " + (first + second)); break;
                case '-': System.out.println("Result: " + (first - second)); break;
                case '*': System.out.println("Result: " + (first * second)); break;
                case '/': if (second != 0){
                            System.out.println("Result: " + (first / second)); break;
                        } else{
                            System.out.println("You can't divide by zero."); break;
                        }
                default: System.out.println("That is not a valid operator.");
            }
            System.out.print("Do you want to continue?(Y/N) ");
            answer = scanner.next().charAt(0);
        }while(answer == 'y' || answer == 'Y');
        scanner.close();
    }
}
