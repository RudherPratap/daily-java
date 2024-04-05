public class ReverseArray {
    public static void main(String[] args) {
        int i, j;
        int[] arr = {60, 50, 40, 30, 20, 10};

        System.out.println("Original Array");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

        for (i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        System.out.println("\nReversed Array");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        }
    }
}
