import java.util.Arrays;
// Question One 
public class ArrayStatistics {
    public static void main(String[] args) {

        int[] array = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(array);
        System.out.println("Median: " + median);

        double stdDeviation = calculateStandardDeviation(array, mean);
        System.out.println("Standard Deviation: " + stdDeviation);
    }

    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }

    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}

//Question Two 
public class NigeriaFlag {
    public static void main(String[] args) {
        int height = 9; 
        int width = 27; 

        for (int i = 0; i < height; i++) { 
            for (int j = 0; j < width; j++) { 
                if (j < width / 3 || j >= 2 * width / 3) {
                    
                    System.out.print("G");
                } else {
                    
                    System.out.print("W");
                }
            }
            System.out.println();
        }
    }
}

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