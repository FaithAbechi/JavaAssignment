//Question Four 
import java.util.Scanner;

public class Array2DUserInput {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number for index (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nYou entered:");

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// Name: Faith Abechi 
// Matriculation NUmber: 23CD010072
// REG.NO: 2301226
// Dept: Computer Science 