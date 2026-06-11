import java.util.Scanner;
public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; // 0=phy,1=chem,2=math
        double[] percent = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": ");
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Math marks: ");
            marks[i][2] = sc.nextInt();
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        System.out.println("\nPhysics   Chemistry   Math   %age   Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(
                marks[i][0] + "   " +
                marks[i][1] + "   " +
                marks[i][2] + "   " +
                String.format("%.2f", percent[i]) + "   " +
                grade[i]
            );
        }
    }
}