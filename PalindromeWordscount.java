import java.util.Scanner;

public class PalindromeWordscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        int count = 0;

        for (String word : words) {

            if (word.length() > 0 && isPalindrome(word)) {
                count++;
                System.out.println("word : " + word);
            }

        }

        System.out.println("Number of palindrome words: " + count);
    }

    public static boolean isPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}