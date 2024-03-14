import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dzien dobry professor");
        int a = 0;
        int b = 0;
        for(int i=0; i <=10; i++){
            System.out.println(String.format("%d terms is:", i) + a);
            a = b;
            b = a+b;
            b++;
        }
    }
}