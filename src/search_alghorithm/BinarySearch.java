package search_alghorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {5, 8, 3, 14, 1, 6, 7, 2, 9, 13, 11, 10, 12, 4, 15};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int target = in.nextInt();

        int left = 0;
        int right = array.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                System.out.println(mid);
                found = true;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element did  not find.");
        }
    }
}
