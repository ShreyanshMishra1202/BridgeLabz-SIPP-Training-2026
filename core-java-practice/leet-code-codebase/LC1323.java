import java.util.Scanner;

public class LC1323 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int temp=num;
        int cnt=0,idx=-1;
        while(temp!=0){
            cnt++;
            if(temp%10==6){
                idx=cnt;
            }
            temp/=10;
        }

        int x=(int)Math.pow(10,idx-1);
        x=x*3;
        System.out.println("Largest No :- "+(num+x));
    }
}
