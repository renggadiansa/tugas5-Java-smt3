import java.util.Scanner;

public class FirstAndLastString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String swappedWord = lastChar + word.substring(1, word.length() - 1) + firstChar;
                result.append(swappedWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        System.out.println("String hasil: " + result.toString().trim());

        scanner.close();
    }
}
