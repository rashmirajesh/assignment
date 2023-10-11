import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String s) {
        // Create a set to store the unique lowercase letters seen in the input
        Set<Character> lettersSeen = new HashSet<>();
        
        // Iterate through the characters in the input
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                lettersSeen.add(c);
            }
        }
        
        // Check if all 26 letters from 'a' to 'z' are present in the set
        return lettersSeen.size() == 26;
    }
}
