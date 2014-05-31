package copytwodimensionalarray;

/**
 *
 * Problem taken from Data Structures & Algorithms In Java 5th Edition
 * R-3.1 "Give a Java code fragment to clone a two-dimensional array, a, of float entries to another two-dimensional array, b, of similar type and size."
 * 
 * @author Matt
 */
public class CopyTwoDimensionalArray {
    float [][] mArray;
    
    CopyTwoDimensionalArray(float[][]arr) {
        mArray = arr;
    }
    
    /**
     * 
     * @param input two-dimensional array to be copied
     * @return copy of provided array
     */
    public float[][]copyTwoDimensionalArray(float[][]input) {
        float[][] retArray = new float[input.length][];
        for(int i = 0; i < input.length; i++) {
            retArray[i] = input[i].clone();
        }
        return retArray;
    }
    
        /**
     * 
     * @param input two-dimensional array to be printed
     */
    public void printTwoDimensionalArray() {
        System.out.print("{");
        for (float[] loopedInput : mArray) {
            System.out.print("{");
            for (int j = 0; j < loopedInput.length; j++) {
                System.out.print(loopedInput[j]);
                if (j < (loopedInput.length - 1)) {
                    System.out.print(",");
                }
            }
            System.out.print("}");
        }
        System.out.println("}");
    }
}
