import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {88, 56, 45, -15, 74, 65, 93};


        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = inputScanner.nextInt();

        Integer enYakinKucuk = null;
        Integer enYakinBuyuk = null;

        for (int i : list) {
            if (i < input) {
                if (enYakinKucuk == null || i > enYakinKucuk) {
                    enYakinKucuk = i;
                }
            }
            if (i > input) {
                if (enYakinBuyuk == null || i < enYakinBuyuk) {
                    enYakinBuyuk = i;
                }
            }
        }

        if (enYakinKucuk != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük bir eleman yok.");
        }

        if (enYakinBuyuk != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük bir eleman yok.");
        }

        inputScanner.close();
    }
}
