import java.util.Scanner;
public class ushesabi {
    static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return  base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değerini giriniz: ");
            int base = input.nextInt();

            System.out.print("Üs değerini giriniz: ");
            int exponent = input.nextInt();

            int result = power(base,exponent);
            System.out.println("Sonuç : " + result);
            System.out.println("devam etmek istiyor musunuz ? (e/h): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("h")) {
                break;
            }
        }
    }
}
