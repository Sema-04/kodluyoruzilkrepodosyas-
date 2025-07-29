import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("sema")&& password.equals("SK0203")){
                System.out.println("Merhaba, X bankasına Hoşgeldiniz!");
                do{
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            int deposit = input.nextInt();
                            balance+=deposit;
                            System.out.println("Yeni bakiye:" + balance + "TL");
                            break;
                        case 2:
                                System.out.print("Çekilecek para miktari: ");
                                int withdraw = input.nextInt();
                                if (withdraw > balance){
                                    System.out.println("Bakiye yetersiz. ");
                                } else {
                                    balance -= withdraw;
                                    System.out.println("Yeni bakiye" + balance + "TL");
                                }
                                break;
                        case 3:
                                    System.out.println("Bakiyeniz: " + balance + "TL");
                                    break;
                        case 4:
                            System.out.println("Çıkış yapılıyor... Tekrar görüşmek üzere!");
                            break;
                        default:
                            System.out.println("Geçersiz bir işlem seçtiniz!");
                    }
                }while (select !=4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz." );
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan giriş hakkınız: " +right);
                }
            }
        }
    }
}
