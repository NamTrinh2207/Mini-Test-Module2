import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int numbers = scanner.nextInt();
        System.out.printf("prime numbers less than %d : ", numbers);
        int n = 2;
        while (n < numbers) {
            if (checkSnt(n)) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    //Hàm check số nguyên tố
    public static boolean checkSnt(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= i - 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}




