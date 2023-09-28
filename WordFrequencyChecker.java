import java.util.Scanner;

public class WordFrequencyChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String[] sentence = sc.nextLine().split(" ");

        System.out.print("Enter a word to find its frequency: ");
        String wordToFind = sc.nextLine();

        int frequency = 0;

        for (String word : sentence) {
            if (word.matches(wordToFind)) {
                frequency++;
            }
        }

        sc.close();

        System.out.println("The word '" + wordToFind + "' appears " + frequency + " times in the sentence.");
    }
}
