package org.example;

public class BinarySearch {
    public static int search(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        boolean isTheLastIsStart = false;

        while (start < end) {
            mid = (start + end) / 2;
            if (start == mid || end == mid) break;
            if (mid + 1 == array[mid]) {
                start = mid;
//                System.out.println("Start" + start);
            } else {
                end = mid;
//                System.out.println("End" + end);
            }
        }
        mid = (start + end) / 2;
        if (mid + 1 == array[mid]) {
            start = mid;
            isTheLastIsStart = true;
//            System.out.println("Start" + start);
        }else {
            end = mid;
            isTheLastIsStart = false;
//            System.out.println("End" + end);
        }
        if (isTheLastIsStart){
            return end + 1;
        }else {
            return start + 1;
        }
    }
}
