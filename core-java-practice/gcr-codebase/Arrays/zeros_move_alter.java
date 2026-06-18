// given an array of integers, write a java program move all the zeros equally to the start and end of the array if total zeros are even and equal zeros at start and end and one in middle if total zeros are odd while maintaining the relative order of the non-zero elements. if total zeros are even then move half of the zeros to the start and half to the end of the array. if total zeros are odd then move half of the zeros to the start and half to the end of the array and one zero in the middle of the array. if only 1 zero is present then move it to the middle of the array. if no zeros are present then return the same array.
public class zeros_move_alter {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        if (count == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            return;
        }

        if (count % 2 == 0) {
            int half = count / 2;
            for (int i = 0; i < half; i++) {
                result[i] = 0;
            }
            for (int i = n - half; i < n; i++) {
                result[i] = 0;
            }
        } else {
            int half = count / 2;
            for (int i = 0; i < half; i++) {
                result[i] = 0;
            }
            result[half + (n - count)] = 0; // place one zero in the middle
            for (int i = n - half; i < n; i++) {
                result[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

    }
}