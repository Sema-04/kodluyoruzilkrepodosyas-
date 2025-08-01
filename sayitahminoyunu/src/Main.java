import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 101);
        int userGuess = -1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("0 ile 100 arasında bir sayı tuttum.");
        System.out.println("Tahmininizi yapın!");


        while (userGuess != randomNumber) {
            System.out.print("Tahmininiz: ");
            userGuess = scanner.nextInt();

            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Daha büyük bir sayı deneyin.");
            } else if (userGuess > randomNumber) {
                System.out.println("Daha küçük bir sayı deneyin.");
            } else {
                System.out.println("Tebrikler! " + randomNumber + " sayısını " + attempts + " tahminde bildiniz.");
            }
        }

        scanner.close();
    }
}
