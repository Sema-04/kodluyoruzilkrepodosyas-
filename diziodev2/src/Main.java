public class Main {
    public static void main(String[] args) {
     int[] list = {10,20,20,10,10,20,5,20};
     boolean[] visited = new boolean[list.length];
        System.out.println("Tekrar sayıları: ");

        for(int i =0; i < list.length; i++) {
            if(visited[i]) {
                continue;
            }
            int count = 1;

            for(int j = i +1; j < list.length; j++) {
                if(list[i] == list[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}