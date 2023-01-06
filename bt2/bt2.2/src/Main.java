public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 20, 14, 6, 4, 9, 8, 7, 10, 13, 15, 17};
        System.out.print("arr : ");
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("max arr = " + max);
    }
}