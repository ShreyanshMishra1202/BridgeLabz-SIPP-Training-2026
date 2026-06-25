import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();

        if (num > 0 && num < 100) {
            System.out.println("Multiples of " + num + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % num == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}

