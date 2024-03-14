import java.util.Random;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        weightOnMars();
        evenOdd();
        taxCalculator();
    }

    //    Task 2
    public static void weightOnMars(){
        float weightMurzaliev = 85;
        System.out.println("My weight on Earth is " +weightMurzaliev + " kg");

        float weightMarsMurzaliev = weightMurzaliev*38/100;
        System.out.println("My weight on Mars is " + weightMarsMurzaliev + " kg");

        System.out.println(String.format("My weight on Mars in double is: %.4f", (double)weightMarsMurzaliev));

        System.out.println("My weight in Mars in DT int " + (int)(double)weightMarsMurzaliev);

    }
    //    Task 3
    public static void evenOdd(){
        int number = (int)(Math.random()*100+1);
        if(number%2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number +" is odd" );
        }
    }

    //    Task 5
    public static void taxCalculator(){
        BigDecimal netPrice = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");
        double net = 9.99;
        double vat = 0.23;

        BigDecimal grossValue = netPrice.multiply(BigDecimal.ONE.add(vatRate));
        double gross = net+(net*vat);

        System.out.println("Normal: Net price of product is " + net);
        System.out.println("BigDecimal: Net price of product is " + netPrice);
        System.out.println("=======================");
        System.out.println("Normal: Gross value with VAT 23% is " + gross);
        System.out.println("BigDecimal: Gross value with VAT 23% is " + grossValue);
        System.out.println("=======================");
        BigDecimal totalGrossPrice = grossValue.multiply(new BigDecimal("10000"));
        System.out.println("Normal: Gross value of 10000 products with VAT 23% is " + (gross*10000));
        System.out.println("BigDecimal: Gross value of 10000 products with VAT 23% is " + totalGrossPrice);
        System.out.println("=======================");
        BigDecimal netTotalPrice = totalGrossPrice.divide(BigDecimal.ONE.add(vatRate));
        System.out.println("Normal: Gross value of 10000 with excluded VAT 23% is " + (gross*10000)/(1+vat));
        System.out.println("BigDecimal: Gross value of 10000 with excluded VAT 23% is " + netTotalPrice);
    }
}