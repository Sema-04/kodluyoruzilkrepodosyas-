import java.util.Scanner;
public class ushesaplama {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);

        System.out.print("taban değerini giriniz: ");
        int taban = input.nextInt();

        System.out.print("us değerini giriniz: ");
        int us = input.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}
