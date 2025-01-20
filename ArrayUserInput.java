//Question Three
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nYou entered:");

        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}
// Name: Faith Abechi 
// Matriculation NUmber: 23CD010072
// REG.NO: 2301226
// Dept: Computer Science 