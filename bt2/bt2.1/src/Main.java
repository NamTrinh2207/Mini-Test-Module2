public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 6, 4, 9, 8, 7, 10};
        System.out.print("arr : ");
        int sum = 0;
        for (int i : arr) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("sum arr = " + sum);
    }
}