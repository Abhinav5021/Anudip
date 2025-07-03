public class Array2d {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// A jagged array is an array of arrays, where each inner array can have a
// different size. Unlike a traditional
// multi-dimensional array where all rows (or columns) have the same length,
// jagged arrays allow for varying
// lengths within the same array. This flexibility is useful when dealing with
// data that doesn't neatly fit into a
// rectangular structure.