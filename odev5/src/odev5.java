 import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        int r;
        double pi =3.14;
        double alfa;
       Scanner input =new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açıyı (açı değeri 𝛼) giriniz: ");
        alfa = input.nextDouble();
        double alan = (pi * r * r * alfa) / 360;
        System.out.println("daire diliminin alanı: "+ alan);
    }
}
