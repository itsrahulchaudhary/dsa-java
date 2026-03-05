package com.example.dsa.binarySearch.medium;

import java.util.Arrays;

public class BS11PainterPartition {
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};  // Length of boards
        int k = 2;  // Number of painters
        System.out.println(
                findLargestMinDistanceBS(boards,k)
        );

    }

    public static int findLargestMinDistance(int[] boards, int k) {
        int low = Arrays.stream(boards).max().getAsInt();  // Largest single board
        int high = Arrays.stream(boards).sum();            // Sum of all boards

        for (int time = low; time <= high; time++) {
            if (countPainters(boards, time) <= k) {
                return time;  // Found a valid minimum time
            }
        }
        return low;  // Fallback (shouldn't usually reach here)
    }

    public static int findLargestMinDistanceBS(int[] boards, int k) {
        int low = Arrays.stream(boards).max().getAsInt();
        int high = Arrays.stream(boards).sum();
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1; // Too few painters → increase allowed time
            } else {
                result = mid; // Valid time → try to reduce it
                high = mid - 1;
            }
        }

        return result;
    }


    public static int countPainters(int[] boards, int time) {
        int painters = 1;         // Start with one painter
        int boardsPainter = 0;    // Time consumed by current painter

        for (int board : boards) {
            if (boardsPainter + board <= time) {
                // Assign board to current painter
                boardsPainter += board;
            } else {
                // Assign board to next painter
                painters++;
                boardsPainter = board;
            }
        }

        return painters;
    }
}
