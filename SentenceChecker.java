import java.util.Scanner;

public class SentenceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine().trim();
        sc.close();

        if (input.matches("^[A-Z][A-Z ]*$") && !input.matches(".*[.!?].*")) {
            System.out.println("Valid sentence.");
        } else {
            System.out.println("Invalid sentence. Sentence must be in uppercase and should not contain '.', '?', or '!'");
        }
    }
}
