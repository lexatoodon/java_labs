import java.util.Scanner;
public class RectangleArea {
    private float width;
    private float height;
    private float area;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type width: ");
        width = scanner.nextFloat();

        System.out.println("Type height: ");
        height = scanner.nextFloat();
        scanner.close();
    }
    public void computeField(){
        area = width*height;
    }
    public void fieldDisplay(){
        String text = String.format("The area of a triangle with width %.1f and height %.1f is %.2f", width, height, area);
        System.out.println(text);
    }
}
