package copytwodimensionalarray;

/**
 *
 * @author Matt
 */
public class CopyTwoDimensionalArray {
    
    /**
     * 
     * @param input two-dimensional array to be copied
     * @return copy of provided array
     */
    public float[][]copyTwoDimensionalArray(float[][]input) {
        for(float [] b : input) {
            for(float num : b) {
                System.out.println(num);
            }
        }
        return null;
    }
}
