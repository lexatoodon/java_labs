import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        calculator();
//        bmiIndex();
//        squareRoot();
        smallestLargestFinder();
    }

    public static void calculator(){
        System.out.println("This calculator will perform addition, subtraction, multiplication and quotient");
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        float inputOne = scanner.nextFloat();

        System.out.println("Second number");
        float inputTwo = scanner.nextFloat();

        System.out.println("Addition: " + (inputOne+ inputTwo));
        System.out.println("Subtraction: " + (inputOne-inputTwo));
        System.out.println("Multiplication: " + (inputOne*inputTwo));
        System.out.println("Quotient: " + (inputOne/inputTwo));
    }

    public static void bmiIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in meters: ");
        float height = scanner.nextFloat();
        System.out.println("Enter your weight in kg: ");
        float weight = scanner.nextFloat();

        float bmiIndex = (weight/(float)Math.pow(height,2));
        float roundedBMI = BigDecimal.valueOf(bmiIndex).setScale(3, BigDecimal.ROUND_DOWN).floatValue();

        if(roundedBMI<=16){
            System.out.println("You might be hungry");
        }if(roundedBMI>16 && roundedBMI<16.99){
            System.out.println("Emaciation");
        }if(roundedBMI>= 17 && roundedBMI <18.49){
            System.out.println("Underweight");
        }if(roundedBMI>=18.5 && roundedBMI<22.99){
            System.out.println("Normal, low range");
        }if(roundedBMI>=23 && roundedBMI< 24.99){
            System.out.println("Normal, high range");
        }if(roundedBMI>=25 && roundedBMI< 27.49){
            System.out.println("Overweight, low range");
        }if(roundedBMI>=27.5 && roundedBMI< 29.99){
            System.out.println("Overweight, high range");
        }if(roundedBMI>=30 && roundedBMI< 34.9){
            System.out.println("Obesity, 1st degree");
        }if(roundedBMI>=35 && roundedBMI< 39.99){
            System.out.println("Obesity, 2nd degree");
        }if(roundedBMI>=40){
            System.out.println("glork the destroyer");
        }
    }

    public static void squareRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = scanner.nextFloat();
        if (a == 0) {
            System.out.println(" 'a' cannot be zero.");
            return;
        }
        System.out.println("Enter b: ");
        float b = scanner.nextFloat();

        System.out.println("Enter c: ");
        float c = scanner.nextFloat();
        float delta = (float) Math.sqrt(Math.pow(b,2)-(4*a*c));
        float x1, x2 = 0;
        System.out.println("=======================");
        switch ((delta > 0) ? 2 : (delta == 0) ? 1 : 0) {
            case 2:
                x1 = (float) (((-b)+delta)/(2*a));
                x2 = (float) (((-b)-delta)/(2*a));
                System.out.println("X_1 is : " + x1);
                System.out.println("X_2 is : " + x2);
                break;
            case 1:
                x1 = (float) (((-b)+delta)/(2*a));
                System.out.println("X_1 is : " + x1);
                break;
            default:
                System.out.println("No roots or complex roots");
                break;
        }

    }

    public static void smallestLargestFinder(){
        int[] randomNumber = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumber[i] = ((int) (Math.random() * 100) + 1);
            System.out.println(randomNumber[i]);
        }
        int largest =  100;
        int smallest = 1;
        int i = 0;
        while (i<randomNumber.length) {
            if(randomNumber[i]<largest){
                largest = randomNumber[i];
            }if(randomNumber[i]>smallest){
                smallest = randomNumber[i];
            }
            i++;
        }
        ;
        System.out.println("Smallest number: " + largest);
        System.out.println("Largest number: " + smallest);

    }

}