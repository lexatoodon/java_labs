import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        RectangleArea rectangle = new RectangleArea();
//        rectangle.getData();
//        rectangle.computeField();
//        rectangle.fieldDisplay();\
//        ==============================
        Car car = new Car("Melex 443", "Melex", 2019, 580, "White", 1000);

        String properties = car.toString();
        System.out.println(properties);
        System.out.println("==================");
        car.sell(1);

        System.out.println("==================");
        String brand = car.getBrand();
        double price = car.getPrice();
        String model = car.getModel();
        String color = car.getColor();
        int quantity = car.getQuantity();

        System.out.println("==================");
        car.setPrice(640);
        car.setColor("Black");
        car.setBrand("Melex PRODUCENT POJAZDÓW ELEKTRYCZNYCH");

        String updatedProperties = car.toString();
        System.out.println(updatedProperties);
//        ==============================

    }
}