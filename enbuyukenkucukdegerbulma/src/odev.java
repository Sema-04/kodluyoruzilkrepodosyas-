import java.util.Scanner;
public class odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n= input.nextInt();

        if(n <= 0){
            System.out.println("Geçerli bir sayı adedi giriniz. ");
            return;
        }
            int number;
            int max =Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i =1; i <= n; i++){
                System.out.print(i + ". sayıyı girin: ");
                number= input.nextInt();

                if(number < min){
                    min=number;
                }
                if (number > max){
                    max = number;
                }
            }
            System.out.println("en küçük sayı: " + min);
            System.out.println("en büyük sayı: " + max);

    }
}
