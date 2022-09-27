import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleCalculator calculator = new SimpleCalculator();

        System.out.print("Enter the value for the First number: ");
        calculator.setFirstNumber(sc.nextDouble());
        System.out.print("Enter the value for the Second number: ");
        calculator.setSecondNumber(sc.nextDouble());
        System.out.println();

        System.out.println("Addition = " + calculator.getAdditionResult());
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());

        sc.close();
    }
}