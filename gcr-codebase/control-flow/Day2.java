import java.util.Scanner;

// A kingdom's tax system charges 5% for income <10K, 15% for 10K–
// 50K, 30% above 50K. Read a citizen's income, print tax bracket and
// amount. Extend: loop over an array of 10 citizens and tally total tax
// collected.

public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=10;i++){
            double tax;
            int x=sc.nextInt();
            if(x<10000){
                tax=5;
            }
            else if(x<=50000){
                tax=15;
            }
            else{
                tax=30;
            }

            System.out.println("tax bracket for person "+i+" is "+tax+"% and amount is "+((tax/100)*x));
        }
    }
}
