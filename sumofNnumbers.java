import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = 1;

        int sum = 0;
        while (n <= i) {
            sum = sum + n; // sum += n;
            System.out.print(n + " ");

            n++;

        }
        System.out.println(" The sum of numbers are : " + sum);

    }
}