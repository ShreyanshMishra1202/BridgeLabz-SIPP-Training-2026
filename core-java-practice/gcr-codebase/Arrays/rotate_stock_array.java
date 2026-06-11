// A warehouse stores item quantities in an array. Find the max, min,
// total stock, and detect duplicates. Extend: rotate the stock array by
// k positions (simulate daily shift handover), and transpose a 2D shelf
// grid.

import java.util.Arrays;

public class rotate_stock_array {
    public static void main(String[] args) {
        int[] items={2,3,4,5,6,7,3,22,5,6,2,1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
        boolean duplicacy=false;

        for(int i:items){
            if(i<min) min=i;
            if(i>max) max=i;
            total+=i;

        }
        System.out.println(Arrays.toString(rotateArray(items, 3)));

        System.out.println("Max = "+max+", Min = "+min+", Total = "+total);
    }

    public static int[] rotateArray(int[] arr,int k){
        int n=arr.length;
        int[] result=new int[n];

        for(int i=0;i<n;i++){
            int newIndex = (i+k)%n;
            result[newIndex]=arr[i];
        }
        return arr;
    }
}
