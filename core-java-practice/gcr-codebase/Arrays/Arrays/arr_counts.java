// package core-java-practice.gcr-codebase.programming-elements.Arrays;

import java.util.Arrays;

public class arr_counts {
    public static void main(String[] args) {
        int arr[]={0,1,3,1,2,3,0,3,2,1,0};
        int cnt[]=new int[10];

        for(int i:arr){
            cnt[i]=cnt[i]+1;
        }
        System.out.println(Arrays.toString(cnt));
    }
}
