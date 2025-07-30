import java.util.Scanner;

public class odev {

    static void recursivePattern(int number, int original, boolean isDecreasing) {
        System.out.print(number + " ");


        if (isDecreasing) {
            if (number <= 0) {
                recursivePattern(number + 5, original, false);
            } else {
                recursivePattern(number - 5, original, true);
            }
        }

        else {
            if (number == original) {
                return;
            } else {
                recursivePattern(number + 5, original, false); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scanner.nextInt();

        recursivePattern(n, n, true);
    }
}
