public class NigerianFlag {
    public static void main(String[] args) {
        int rows = 6; 
        int columns = 18;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3 || j >= 2 * columns / 3) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
// Name: Faith Abechi 
// Matriculation NUmber: 23CD010072
// REG.NO: 2301226
// Dept: Computer Science 
