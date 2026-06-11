import java.util.Scanner;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter Amar's age: ");
        int ageA = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageB = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageC = sc.nextInt();

        // Heights
        System.out.print("Enter Amar's height: ");
        int hA = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int hB = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int hC = sc.nextInt();

        // Youngest
        if (ageA < ageB && ageA < ageC)
            System.out.println("Amar is the youngest");
        else if (ageB < ageA && ageB < ageC)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // Tallest
        if (hA > hB && hA > hC)
            System.out.println("Amar is the tallest");
        else if (hB > hA && hB > hC)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}
