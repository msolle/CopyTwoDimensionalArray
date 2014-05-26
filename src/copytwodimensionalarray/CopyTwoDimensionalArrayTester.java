package copytwodimensionalarray;

/**
 *
 * Problem taken from Data Structures & Algorithms In Java 5th Edition
 * R-3.1 "Give a Java code fragment to clone a two-dimensional array, a, of float entries to another two-dimensional array, b, of similar type and size."
 * 
 * @author Matt
 */
public class CopyTwoDimensionalArrayTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test 2D Arrays
        float[][] testOne = {{1.2f, 3.1f}, {20.0f, 1.0f}};
        
        //Testing
        CopyTwoDimensionalArray ctwa = new CopyTwoDimensionalArray();
        ctwa.copyTwoDimensionalArray(testOne);
        
    }
}
