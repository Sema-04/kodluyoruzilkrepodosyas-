import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenari giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = girdi.nextInt();
        System.out.print("3. kenarı giriniz: ");
        c =girdi.nextInt();

        double u = (a + b+ c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("üçgenin alanı: " + alan);
    }
}
