import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                String dogruSifre = "java123";

                System.out.print("Şifrenizi giriniz: ");
                String girilenSifre = input.nextLine();

                if (girilenSifre.equals(dogruSifre)) {
                    System.out.println("Giriş başarılı!");
                } else {
                    System.out.println("Şifre yanlış.");
                    System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
                    String cevap = input.nextLine();

                    if (cevap.equalsIgnoreCase("evet")) {
                        System.out.print("Yeni şifreyi girin: ");
                        String yeniSifre = input.nextLine();

                        if (yeniSifre.equals(dogruSifre)) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                    } else {
                        System.out.println("Şifre sıfırlanmadı.");
                    }
                }
            }
        }


