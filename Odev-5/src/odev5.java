import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi= input.nextInt();
        int toplam = 0;
        while (sayi != 0) {
            int basamak = sayi % 10; // son basamağı al
            toplam += basamak;       // toplamla topla
            sayi /= 10;              // sayıyı bir basamak küçült
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
