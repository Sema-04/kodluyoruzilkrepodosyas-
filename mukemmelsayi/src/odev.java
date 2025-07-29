import java.util.Scanner;
public class odev {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        int number = input.nextInt();
        int total = 0;

        if(number<= 0){
            System.out.println("lütfen pozitif bir sayma sayısı giriniz");
            return;
        }
        int i = 1;
        while (i < number){
            if(number % i == 0){
                total += i;
            }
            i++;
        }
        if(total == number){
            System.out.println(number  + " mükemmel sayıdır.");
        } else{
            System.out.println(number  + " mükemmel sayı değildir.");
        }
    }
}
