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
// Name: Faith Abechi 
// Matriculation NUmber: 23CD010072
// REG.NO: 2301226
// Dept: Computer Science 