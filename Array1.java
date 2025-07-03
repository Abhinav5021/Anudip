public class Array1 {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}