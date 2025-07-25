import java.util.Scanner;
public class ucakbileti {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Mesafeyi km cinsinden giriniz: ");
            int mesafe = input.nextInt();

            System.out.print("Yaşınızı giriniz: ");
            int yas = input.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
            int tip = input.nextInt();

            if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
                System.out.println("Hatalı Veri Girdiniz !");
                return;
            }

            double birimFiyat = 0.10;
            double toplamFiyat = mesafe * birimFiyat;

            // Yaş indirimi
            double yasIndirimi = 0;
            if (yas < 12) {
                yasIndirimi = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = 0.10;
            } else if (yas > 65) {
                yasIndirimi = 0.30;
            }

            toplamFiyat -= toplamFiyat * yasIndirimi;

            if (tip == 2) {
                toplamFiyat -= toplamFiyat * 0.20;
                toplamFiyat *= 2;
            }

            System.out.printf("Toplam Bilet Fiyatı: %.2f TL%n", toplamFiyat);
        }
    }
