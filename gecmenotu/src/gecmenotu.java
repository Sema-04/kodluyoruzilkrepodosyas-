import java.util.Scanner;
public class gecmenotu {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

                int mat, fizik, turkce, kimya, muzik;
                int toplam = 0;
                int dersSayisi = 0;

                System.out.print("Matematik notunuz: ");
                mat = input.nextInt();
                if (mat >= 0 && mat <= 100) {
                    toplam += mat;
                    dersSayisi++;
                }

                System.out.print("Fizik notunuz: ");
                fizik = input.nextInt();
                if (fizik >= 0 && fizik <= 100) {
                    toplam += fizik;
                    dersSayisi++;
                }

                System.out.print("Türkçe notunuz: ");
                turkce = input.nextInt();
                if (turkce >= 0 && turkce <= 100) {
                    toplam += turkce;
                    dersSayisi++;
                }

                System.out.print("Kimya notunuz: ");
                kimya = input.nextInt();
                if (kimya >= 0 && kimya <= 100) {
                    toplam += kimya;
                    dersSayisi++;
                }

                System.out.print("Müzik notunuz: ");
                muzik = input.nextInt();
                if (muzik >= 0 && muzik <= 100) {
                    toplam += muzik;
                    dersSayisi++;
                }

                if (dersSayisi == 0) {
                    System.out.println("Geçerli not girilmedi, ortalama hesaplanamadı.");
                } else {
                    double average = (double) toplam / dersSayisi;
                    System.out.println("Ortalama: " + average);
                    if (average <= 55) {
                        System.out.println("Kaldı.");
                    } else {
                        System.out.println("Geçti.");
                    }
                }

                input.close();
            }
        }

    
