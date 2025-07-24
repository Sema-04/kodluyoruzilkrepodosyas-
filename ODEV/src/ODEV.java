import java.util.Scanner;
public class ODEV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilo;
        double boy;
        System.out.print("lütfen boyunuzu (metre cinsinden giriniz): ");
        boy = input.nextDouble();
        System.out.print("lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();
        double VKI =kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz:"+ VKI);
    }
}
