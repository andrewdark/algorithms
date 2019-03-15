package ua.pp.darknsoft;

public class MainClass {

    public static void main(String[] args) {
        int[] ara = new int[]{
                1, 2, 3, 5, 6, 8, 10, 11, 14, 15
        };

        System.out.println(binarySearch(11, ara));
    }

    public static int binarySearch(int key, int[] ara) {
        int lo = 0;
        int hi = ara.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < ara[mid]) {
                hi = mid - 1;
            } else if (key > ara[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
