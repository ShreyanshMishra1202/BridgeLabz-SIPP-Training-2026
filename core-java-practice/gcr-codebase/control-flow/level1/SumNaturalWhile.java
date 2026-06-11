import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int i = 1, sumLoop = 0;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using while loop = " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
