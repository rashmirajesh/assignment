import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        
        // Create a random number generator
        Random random = new Random();
        
        // Shuffle the array
        for (int i = array1.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            // Swap originalArray[i] and originalArray[j]
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        
        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array1));
    }
}