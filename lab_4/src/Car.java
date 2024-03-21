public class Car{
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;


    public Car(String model, String brand, int year, double price, String color, int quantity){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sell(int customerId) {
        if (this.quantity > 0) {
            System.out.println("Car sold to customer " + customerId);
            delivery(customerId);
            this.quantity--;
        } else {
            System.out.println("Car is out of stock.");
        }
    }

    private void delivery(int customerId) {
        System.out.println("Car sent for delivery for customer with id: " + customerId);
    }

    @Override
    public String toString(){
        return "Car with such properties " +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity;
    }
}
