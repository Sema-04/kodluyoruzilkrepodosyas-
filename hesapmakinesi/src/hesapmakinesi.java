import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n1,n2,select ;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinciyi sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("seçiminiz: ");
        select= input.nextInt();

        switch (select) {
            case 1:
                System.out.println("toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Sonuç: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");

                }
                break;
            default:
                System.out.println("geçersiz işlem");
        }
    }
}
