package copytwodimensionalarray;

/**
 *
 * Problem taken from Data Structures & Algorithms In Java 5th Edition
 * R-3.1 "Give a Java code fragment to clone a two-dimensional array, a, of float entries to another two-dimensional array, b, of similar type and size."
 * 
 * @author Matt
 */
public class FloatArrayCopy {


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test 2D Arrays
        float[][] testOne = {{1.2f, 3.1f}, {20.0f, 1.0f}};
        float[][] testTwo = {{1.0f}, {100.0f, 1000.0f, 10.0f}, {2.0f, 1.0f}};
        float[][] testThree = {{1.1f},{2.2f},{3.3f},{4.4f},{5.5f},{6.6f},{7.7f}};
        
        //testOne
        FloatArray faOne = new FloatArray(testOne);
        FloatArray faOneReturned = new FloatArray(faOne.copy(testOne));
        faOne.print();
        faOneReturned.print();
        
        //testTwo
        FloatArray faTwo = new FloatArray(testTwo);
        FloatArray faTwoReturned = new FloatArray(faTwo.copy(testTwo));
        faTwo.print();
        faTwoReturned.print();
        
        //testThree
        FloatArray faThree = new FloatArray(testThree);
        FloatArray fcThreeReturned = new FloatArray(faThree.copy(testThree));
        faThree.print();
        fcThreeReturned.print();
        
                
    }
}
