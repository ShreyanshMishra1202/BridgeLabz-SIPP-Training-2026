import java.util.Scanner;
public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] multiplicationResult = new int[10];
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();
        if (number < 6 || number > 9) {
            System.out.println("Number must be between 6 and 9.");
            return;
        }
        for (int i = 0; i < 10; i++) {
            multiplicationResult[i] = number * (i + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }
    }
}