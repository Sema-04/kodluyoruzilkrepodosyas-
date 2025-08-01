public class Main {
    public static void main(String[] args) {
        int[] list = {2, 4, 6, 8, 2, 6, 10, 12, 4, 4, 5, 7, 6};

        int[] duplicates = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] == list[j]) && (list[i] % 2 == 0)) {
                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (duplicates[k] == list[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        duplicates[index++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < index; i++) {
            System.out.println(duplicates[i]);
        }
    }
}
