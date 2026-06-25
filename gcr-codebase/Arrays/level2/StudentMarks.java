import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];   
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": ");
            System.out.print("Enter Physics marks: ");
            phy[i] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            chem[i] = sc.nextInt();
            System.out.print("Enter Math marks: ");
            math[i] = sc.nextInt();
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        System.out.println("\nPhysics   Chemistry   Math   %age   Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(phy[i] + "   " + chem[i] + "   " + math[i] + 
                               "   " + String.format("%.2f", percent[i]) + "   " + grade[i]);
        }
    }
}