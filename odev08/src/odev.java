import java.util.Scanner;
public class odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int n = input.nextInt();

        int ilk = 0, ikinci = 1;

        System.out.println("Fibonacci Serisi:");

        for (int i = 1; i <= n; i++) {
            System.out.print(ilk + " ");
            int sonraki = ilk + ikinci;
            ilk = ikinci;
            ikinci = sonraki;
        }
    }
}

