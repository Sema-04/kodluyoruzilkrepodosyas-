git addimport  java.util.Scanner;
public class odev {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Basamak sayısını girin:");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int space = 0; space < (n - i); space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
