import java.util.Scanner;
     public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String word = scanner.nextLine();

        word = word.toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " kelimesi bir palindromdur.");
        } else {
            System.out.println(word + " kelimesi bir palindrom değildir.");
        }
        scanner.close();
    }
}
