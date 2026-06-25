// 1. Student Marks Analyzer 

// A teacher has recorded marks of students in an array.
// Write a program that:
// Accepts marks of students.
// Finds the highest and lowest marks.
// Counts how many students scored above 75.
// Calculates the average marks.
// Displays all marks greater than the average.

import java.util.Scanner;
public class StudentMarkAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        int cnt=0,highest=0,lowest=0;
        double avg=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>highest) highest=arr[i];
            if(arr[i]>lowest) lowest=arr[i];
            if(arr[i]>75) cnt++;
            avg+=arr[i];
        }
        avg=avg/arr.length;
        
        System.out.println("Highest: "+highest);
        System.out.println("Lowest: "+lowest);
        System.out.println("Count of elements more than 75: "+cnt);
        System.out.println("Average: "+avg);
        System.out.println("elements more than average:- ");
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                System.out.println(arr[i]+"  ");
            }
        }
    }
}
