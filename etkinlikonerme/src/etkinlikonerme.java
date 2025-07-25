import java.util.Scanner;
public class etkinlikonerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak");
        } else if (heat < 15) {
            System.out.println("Sinema");
        } else if (heat < 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");


        }
    }
}
