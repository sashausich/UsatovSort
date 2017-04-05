import java.util.Scanner;

/**
 * Created by Usatov on 05.04.2017.
 */
public class UsatovSort {
    public static void main(String[] args) {

        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("1 sort ascending order, not 1 - sort decreasing order");
        sc.nextLine();
        String str = sc.nextLine();
        if (str.equals("1")) {
            sortAscendingOrder(arr);
            System.out.println("Sorted array :");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        } else {
            sortDecreasingOrder(arr);
            System.out.println("Sorted array :");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }


    }

    public static void sortAscendingOrder(int[] arr) {
        if (arr.length == 1) return;
        if (isSortedAscending(arr))
            return;
        while (true) {
            int i = (int) (Math.random() * arr.length);
            int j = (int) (Math.random() * arr.length);
            if (i == j)
                continue;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            if (isSortedAscending(arr))
                break;
        }
    }

    public static void sortDecreasingOrder(int[] arr) {
        if (arr.length == 1) return;
        if (isSortedDescending(arr))
            return;
        while (true) {
            int i = (int) (Math.random() * arr.length);
            int j = (int) (Math.random() * arr.length);
            if (i == j)
                continue;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            if (isSortedDescending(arr))
                break;
        }
    }

    public static boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}