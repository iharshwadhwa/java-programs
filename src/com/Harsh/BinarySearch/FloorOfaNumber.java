package com.Harsh.BinarySearch;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 12};
        int target = 5;
        int ans = floor(arr, target);
        System.out.println("Floor of " + target + " is at index: " + ans + " (value: " + (ans != -1 ? arr[ans] : "None") + ")");
    }

    static int floor(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        return end;
    }
}
