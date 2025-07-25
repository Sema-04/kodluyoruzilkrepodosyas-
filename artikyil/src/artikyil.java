import java.util.Scanner;
public class artikyil {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Yılı giriniz: ");
            int yil = input.nextInt();

            boolean artikYil = false;
            
            if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                    if (yil % 400 == 0) {
                        artikYil = true;
                    } else {
                        artikYil = false;
                    }
                } else {
                    artikYil = true;
                }
            } else {
                artikYil = false;
            }

            if (artikYil) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        }
    }

