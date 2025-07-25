import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Geçersiz giriş! r, n'den büyük olamaz ve negatif değer girilemez.");
        } else {
            int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }
    }

    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
