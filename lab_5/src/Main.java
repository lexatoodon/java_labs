import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        diagonalMatrix();
        concatenateStrings();
    }

    //task 3
    public static void diagonalMatrix(){
        int[][] matrix = new int[10][10];

        int sum = 0;
        for(int i = 0; i<10; i++){
            matrix[i][i] = i;
            sum += matrix[i][i];
        }
        System.out.println(sum);
        for(int[] row: matrix){
            for(int i: row){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //task 4
    public static void concatenateStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("String one: ");
        String first = scanner.nextLine();
        System.out.println("String two: ");
        String second = scanner.nextLine();

        String result1, result2 = "";
        result1 = first.concat(second);
        result2 = second.concat(first);

        System.out.println(result1.compareTo(result2));

    }
}