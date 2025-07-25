import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n;
        System.out.print("sınır sayısını giriniz: ");
        n = input.nextInt();
        System.out.println("4'ün kuvvetleri");
        for(int i =1; i <=n; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri");
        for (int i =1; i <=n; i*=5){
            System.out.println(i);
        }
    }
}
